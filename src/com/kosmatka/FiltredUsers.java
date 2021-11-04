package com.kosmatka;

import java.util.*;
import java.util.stream.Collectors;

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


        List<Integer> intlist = new ArrayList<Integer>();
        intlist.add(1);
        intlist.add(51);
        intlist.add(222);
        System.out.println(
        intlist.stream().sorted().collect(Collectors.toList()));
        System.out.println(
        intlist.stream().collect(Collectors.toList()));
        System.out.println(
        intlist.stream().map(Integer-> new Users("liczba", Integer, "male", "poland","numberland"))
                .collect(Collectors.toList()));


        List<Users> usersList = users.stream()
                .filter(o->o.name.endsWith("a"))
                .collect(Collectors.toList());


        System.out.println(usersList);
        System.out.println(usersList.stream().sorted(Comparator.comparing(Users::getBornCountry)).collect(Collectors.toList()));
       List<Users> usersFilterd = users.stream()
               .filter(g->g.gender.equalsIgnoreCase("male"))
               .collect(Collectors.toList());





    }

}
