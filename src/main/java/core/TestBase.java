package core;

import utils.ConfigReader;
import utils.UserDataHelper;

import java.io.File;
import java.util.Map;

public class TestBase {
    public static Map<String, String> testUser;
    private static boolean isUserGenerated = false;
    private static boolean isFirstRun = true;


    public static void initialize() {
//        if (isFirstRun) {
//            cleanAllureResults();
//            isFirstRun = false;
//        }
        if (!isUserGenerated) {
            UserDataHelper userHelper = new UserDataHelper();
            testUser = userHelper.generateUser();
            isUserGenerated = true;
        }
        String browser = ConfigReader.getProperty("browser");
        DriverFactory.initDriver(browser);
    }
//    private static void cleanAllureResults() {
//        File allureResults = new File("allure-results");
//        if (allureResults.exists() && allureResults.isDirectory()) {
//            for (File file : allureResults.listFiles()) {
//                file.delete();
//            }
//        }
//    }

    }
