package com.example.pets.Classes;

import androidx.annotation.Nullable;

public class User {

    String name;
    String username;
    String password;
    String image;

    public User() {
    }

    public User(String name, String username, String password, String image) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.image = image;
    }

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if(this.getUsername().equals(((User) obj).getUsername()) &&
                this.getName().equals(((User) obj).getName()) &&
                this.getPassword().equals(((User) obj).getPassword())
        ){
            return true;
        }
        return false;
    }
}
