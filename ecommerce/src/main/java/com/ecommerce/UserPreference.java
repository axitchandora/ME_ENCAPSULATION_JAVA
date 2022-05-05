package com.ecommerce;

import java.util.HashMap;
import java.util.Map;

public class UserPreference {

    private Map<String, User> userMap;

    // Constructor simulation of loading the user preference data from external source.
    // Here, Hashmap is used for demo purpose.
    public UserPreference(){
        userMap = new HashMap<String, User>(){{
            put("Sabina", new User("Sabina", "COUNTRY_USA","LANGUAGE_SPANISH"));
            put("Andrew", new User("Anand", "COUNTRY_USA","LANGUAGE_ENGLISH"));
            put("Anupama", new User("Anupama", "COUNTRY_INDIA","LANGUAGE_HINDI"));
            put("Anand", new User("Anand", "COUNTRY_INDIA","LANGUAGE_ENGLISH"));
        }};

    }
  
    public void updateUserCountry(String userName, String userCountry) {
        // Get the user
        User user = userMap.get(userName);
        // Create a new User Object with updated values
        User updateUser = new User(user.getUserId(), userCountry, user.getLanguage());
        // Update the User
        userMap.put(userName,updateUser);

        System.out.println(updateUser + " updated successfully.");
    }
 
    public void updateUserLanguage(String userName, String userLanguage) {
        // Get the user
        User user = userMap.get(userName);
        // Create a new User Object with updated values
        User updateUser = new User(user.getUserId(), user.getCountry(),userLanguage);
        // Update the User
        userMap.put(userName,updateUser);

        System.out.println(updateUser + " updated successfully.");
    }


}
