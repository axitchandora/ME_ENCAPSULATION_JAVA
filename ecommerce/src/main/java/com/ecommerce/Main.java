package com.ecommerce;

public class Main {
    public static void main(String[] args) {
        // Call the android/iOS handler code to change user language/country etc.
        // In real world, these functions will be called from your Flask or Django server methods.
        // Don"t worry about them for now - let's live in a simple world :)

        

        UserPreference userPreference = new UserPreference();

        AndroidHandler androidHandler = new AndroidHandler(userPreference);
        IOSHandler iosHandler = new IOSHandler(userPreference);
    
        androidHandler.change_user_country("Anand", "COUNTRY_USA");
        iosHandler.change_user_country("Sabina", "COUNTRY_INDIA");

		androidHandler.change_user_language("Anand", "COUNTRY_USA", "LANGUAGE_SPANISH");
        iosHandler.change_user_language("Sabina", "COUNTRY_INDIA", "LANGUAGE_HINDI");
		androidHandler.change_user_language("Anupama", "COUNTRY_INDIA", "LANGUAGE_ENGLISH");

	}
}
