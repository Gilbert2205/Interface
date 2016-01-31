package com.company;

public class Main {

    public static void main(String[] args) {
//        Test unique = new Test(){
//            public void addNewType(){
//                System.out.println("The question with free method");
//            }
//        };
//        unique.addNewType();
//        new Test(71){
//            private String name = "Drag & Drop";
//            public void addNewType(){
//                System.out.println("added" + getName());
//            }
//            String getName(){return name;}
//        }.addNewType();
//        Test standard = new Test(35);
//        standard.addNewType();
//        EnumTest ap;
//        ap = EnumTest.GoldenDel;
//        System.out.println("Value of ap " +ap);
//        System.out.println();
//        ap = EnumTest.GoldenDel;
//        if (ap == EnumTest.GoldenDel)
//            System.out.println("ap contains GoldenDel.\n");
//        switch (ap){
//            case Jonathan:
//                System.out.println("Jonathan is red");
//                break;
//            case GoldenDel:
//                System.out.println("Dell is yellow");
//                break;
//        }
//        EnumTest allapples[] = EnumTest.values();
//        for (EnumTest a:allapples)
//            System.out.println(a);
//        System.out.println();
//        ap = EnumTest.valueOf("Winesap");
//        System.out.println("ap contains" + ap);
        Offices offices1 = new Offices("Petr", 233, City.Kharkov);
        Offices offices2 = new Offices("Sasha", 244, City.Kiev);
        Offices offices3 = new Offices("Dmitry",265,City.Lvov);
        System.out.println(offices1);
        System.out.println(offices2);
        System.out.println(offices3);
    }

}
