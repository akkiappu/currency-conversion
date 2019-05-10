package companies.online.tests.ncr;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MovieNames {
    String movieURL = "https://jsonmock.hackerrank.com/api/movies/search/?Title=";

    public static void main(String[] args) {
        String[] movies = new MovieNames().get("Spiderman");
        for(String movie : movies){
            System.out.println(movie);
        }
    }

    public String[] get(String movie) {

        List<String> movieList = new ArrayList<>();
        String urlData = readDataFromURL(movieURL + movie);
        if (!urlData.isEmpty()) {
            JsonElement elements = getJsonElements(urlData);
            int pages = elements.getAsJsonObject().get("total_pages").getAsInt();
            for (int i = 1; i <= pages; i++) {
                urlData = readDataFromURL(movieURL + movie + "&page=" + i);
                elements = getJsonElements(urlData);
                JsonArray array = elements.getAsJsonObject().get("data").getAsJsonArray();
                for(JsonElement  e : array){
                    movieList.add(e.getAsJsonObject().get("Title").getAsString());
                }
            }
        }
        return movieList.toArray(new String[movieList.size()]);
    }

    private String readDataFromURL(String path) {
        try {
            URL url = new URL(path);
            InputStream is = url.openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            return sb.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private JsonElement getJsonElements(String data) {
        JsonParser parser = new JsonParser();
        return parser.parse(data);
    }

}
