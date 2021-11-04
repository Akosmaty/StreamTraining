package com.kosmatka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FiltredUsers {

    public void filtredUsers(){

        List<Users> users = Arrays.asList(
                new Users("Adam", 28, "male", "Poland","Poland"),
                new Users("Klauda", 20, "female", "Poland","Poland"),
                new Users("Kamil", 1, "male", "Poland","Poland"),
                new Users("Danil", 21, "male", "Belarus","Poland"),
                new Users("Volha", 31, "female", "Belarus","Poland"),
                new Users("Mariusz", 28, "male", "Poland","Nederland")
                );


       users.stream()
               .filter(g -> g.gender.equals("male"))
               .map(g -> g.toString())
               .forEach(System.out::println);

       List<Users> filtredUsers = new ArrayList<>();


        users.stream().filter(g->g.gender.equals("male"))
                .filter(g->g.livingCountry.equals("Poland"))
                .forEach(g-> filtredUsers.add(g));

        System.out.println("all male users living in Poland "+ filtredUsers);

        System.out.println("pierwotna lista " + users);










    }

}
