package com.kosmatka;

public class Users {
    public String name;
    public int age;
    public String gender;
    public String bornCountry;
    public String livingCountry;


    public Users(String name, int age, String gender, String bornCountry, String livingCountry) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.bornCountry = bornCountry;
        this.livingCountry = livingCountry;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", bornCountry='" + bornCountry + '\'' +
                ", livingCountry='" + livingCountry + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getBornCountry() {
        return bornCountry;
    }

    public String getLivingCountry() {
        return livingCountry;
    }
}
