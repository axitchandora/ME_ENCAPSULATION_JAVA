package com.ecommerce;

public class AndroidHandler {


    private UserPreference userPreference;


    public AndroidHandler(UserPreference userPreference) {
        this.userPreference = userPreference;
    }

    // This function is called by Android app eventually.
    public void change_user_country(String userName, String userCountry) {
        userPreference.updateUserCountry(userName, userCountry);
    }

    // This function is called by Android app eventually.
    public void change_user_language(String userName, String userCountry, String  userLanguage ) {
    
        // Some Android specific code goes here.
        //   Android specific code
        //   ...
        //   ...
        //   Android specific code

        userPreference.updateUserLanguage(userName, userLanguage);
    }
}
