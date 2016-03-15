package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Rose Rose1 = new Rose(), Rose2 = new Rose(), Rose3 = new Rose(), Rose4 = new Rose();
        Charmomile Charmomile1 = new Charmomile(), Charmomile2 = new Charmomile();
        Tulip Tulip1 = new Tulip(), Tulip2 = new Tulip();
        Aster Aster1 = new Aster();

        System.out.println("Rose1 name = " + Rose1.getName());
        System.out.println("Rose2 name = " + Rose2.getName());

        System.out.println("---------------");

        Bouqet Bouqet1 = new Bouqet( Rose1);
        Bouqet1.addFlower( Charmomile1);
        Bouqet1.addFlower( Tulip1);


        System.out.println("Bouqet1 :");
        for (Flower flower : Bouqet1.getFlowers() ) {
            System.out.println( flower.getName());
        }

        System.out.println("---------------");

        List<Flower> someList =new ArrayList<>();

        someList.add(Rose2);
        someList.add(Charmomile2);
        someList.add(Tulip2);
        someList.add(Tulip2);
        someList.add(Aster1);

        Bouqet Bouqet2 = new Bouqet(someList);
        System.out.println("Bouqet2 :");
        for (Flower flower : Bouqet2.getFlowers() ) {
            System.out.println( flower.getName());
        }

        System.out.println("---------------");

        List<Rose> someList2 =new ArrayList<>();

        someList2.add(Rose2);
        someList2.add(Rose3);
        someList2.add(Rose4);

        Rosebush Rosebush1 = new Rosebush(someList2);
        System.out.println("Rosebush1 :");
        for (Rose rose : Rosebush1.getRoses() ) {
            System.out.println( rose.getName());
        }
    }
}
