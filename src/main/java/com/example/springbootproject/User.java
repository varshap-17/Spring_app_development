package com.example.springbootproject;

public class User {
    public String firstName;
    public String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //copy constructor
    public User(User user){
        this.firstName=user.firstName;
        this.lastName= user.lastName;
    }
}
