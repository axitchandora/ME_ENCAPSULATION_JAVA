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

        //   Do some basic validation of whether this language is spoken in the country.
        //   It is given that users in USA can speak only English or Spanish,
        //   and Indians can speak only English or Hindi.

        if(
            ( userCountry.equals("COUNTRY_INDIA") && 
                userLanguage.equals("LANGUAGE_HINDI") || userLanguage.equals("LANGUAGE_ENGLISH" ) )
            ||
            ( userCountry.equals("COUNTRY_USA") && 
                userLanguage.equals("LANGUAGE_HINDI") || userLanguage.equals("LANGUAGE_ENGLISH" ) )
            ){
                userPreference.updateUserLanguage(userName, userLanguage);
        }else{
            try {
                throw new Exception("Invalid country/language combination");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
