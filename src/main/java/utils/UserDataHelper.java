package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UserDataHelper {
    private static final Faker faker = new Faker();
    private static final String FILE_PATH = "src/test/resources/testData/testdata.json";
    private static final ObjectMapper mapper = new ObjectMapper();

    private Map<String, String> currentUser;

    // توليد بيانات مستخدم كاملة
    public Map<String, String> generateUser() {
        currentUser = new HashMap<>();

        currentUser.put("userId", faker.name().username());
        currentUser.put("password", faker.internet().password(6, 10));
        currentUser.put("repeatPassword", currentUser.get("password"));
        currentUser.put("firstName", faker.name().firstName());
        currentUser.put("lastName", faker.name().lastName());
        currentUser.put("email", faker.internet().emailAddress());
        currentUser.put("phone", String.valueOf(faker.number().numberBetween(10000, 99999)));

        currentUser.put("address1", faker.address().streetAddress());
        currentUser.put("address2", faker.address().secondaryAddress());
        currentUser.put("city", faker.address().city());
        currentUser.put("state", faker.address().state());
        currentUser.put("zip", faker.address().zipCode());
        currentUser.put("country", "UAE");

        saveUser(currentUser);
        return currentUser;
    }

    private void saveUser(Map<String, String> user) {
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(FILE_PATH), user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Map<String, String> readUser() {
        try {
            currentUser = mapper.readValue(new File(FILE_PATH), Map.class);
            return currentUser;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
