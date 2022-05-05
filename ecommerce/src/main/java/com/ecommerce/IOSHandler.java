package com.ecommerce;

public class IOSHandler {


    private UserPreference userPreference;


     public IOSHandler(UserPreference userPreference) {
        this.userPreference = userPreference;
    }

    // This function is called by IOS app eventually.
    public void change_user_country(String userName, String userCountry) {
        userPreference.updateUserCountry(userName, userCountry);
    }

     // This function is called by IOS app eventually.
     public void change_user_language(String userName, String userCountry, String  userLanguage ) {
    
        // Some IOS specific code goes here.
        //   IOS specific code
        //   ...
        //   ...
        //   IOS specific code

        userPreference.updateUserLanguage(userName, userLanguage);
    }
}
