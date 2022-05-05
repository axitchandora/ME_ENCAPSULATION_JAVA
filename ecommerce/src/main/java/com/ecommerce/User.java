package com.ecommerce;

public class User {
    private String userId;
    private String language;
    private String country;

    public User(String userId, String country,String language) {
        this.userId = userId;
        this.language = language;
        this.country = country;
    }

    public String getUserId() {
        return userId;
    }

    public String getLanguage() {
        return language;
    }
  
    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "User [country=" + country + ", language=" + language + ", userId=" + userId + "]";
    }
    
}
