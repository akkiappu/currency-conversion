import config.ApplicationConfiguration;
import service.CurrencyConvertService;
import service.impl.CurrencyConvertServiceImpl;
import service.impl.FormatterServiceImpl;
import service.impl.InputValidatorServiceImpl;
import view.Console;

public class Application {
    private CurrencyConvertService currencyConverterService;

    public static void main(String[] args) throws Exception {
        Application currencyConversionApplication = new Application();
        currencyConversionApplication.loadApplicationConfiguration();
        currencyConversionApplication.launchConsole();
    }

    public void loadApplicationConfiguration() throws Exception {
        ApplicationConfiguration config = new ApplicationConfiguration();
        currencyConverterService = new CurrencyConvertServiceImpl(
                config.getCrossCurrencyTable(), config.getCurrencyExchangeRate());

    }

    public void launchConsole() {
        new Console(currencyConverterService, new InputValidatorServiceImpl(), new FormatterServiceImpl()).console();
    }

}
