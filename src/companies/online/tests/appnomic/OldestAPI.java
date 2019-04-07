package companies.online.tests.appnomic;

import java.io.*;
import java.util.*;

public class OldestAPI {
    public static void main (String[] args) {
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));

            Map<String, List<APIDetails>> appApiMap = new HashMap<>();
            Map<String, List<Boolean>> resultMap = new HashMap<>();
            Map<String, List<Integer>> apiVersionMap = new HashMap<>();
            while(in.hasNextLine()) {
                String line = in.nextLine();
                if (!line.isEmpty()){

                    String[] inputToken = line.trim().split(", ");
                    int version = Integer.parseInt(inputToken[2].substring(1, inputToken[2].length()));

                    appApiMap.computeIfAbsent(inputToken[0], (app) ->  new ArrayList<>()).add(new APIDetails(inputToken[1], version));
                    apiVersionMap.computeIfAbsent(inputToken[1], (app) ->  new ArrayList<>()).add(version);
                }
            }

            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));

            appApiMap.entrySet().forEach((app -> app.getValue().forEach(apiDetails -> {
                if(apiVersionMap.get(apiDetails.getApiName()).size() > 1){
                    Optional<Integer> max = apiVersionMap.get(apiDetails.getApiName()).stream().max(Integer::compareTo);
                    if(max.get() > apiDetails.getVersion()){
                        resultMap.computeIfAbsent(app.getKey(),k ->  new ArrayList<>()).add(true);
                    } else{
                        resultMap.computeIfAbsent(app.getKey(),k ->  new ArrayList<>()).add(false);
                    }
                }
            })));

            resultMap.entrySet().forEach(entry -> {
                if(!entry.getValue().contains(false)){
                    output.println(entry.getKey());
                }
            });


        } catch (IOException e) {
            //System.out.println("IO error in input.txt or output.txt");
            System.out.println(e);
        }
    }

    static class APIDetails{
        private String apiName;
        private int version;

        public APIDetails(String apiName, int version) {
            this.apiName = apiName;
            this.version = version;
        }


        public String getApiName() {
            return apiName;
        }

        public int getVersion() {
            return version;
        }
    }
}
