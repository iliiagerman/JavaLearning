package my_practice;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

import static java.lang.Thread.*;

class TreadMyTread1 {
    /*  есть 10 людей с больными зубами и два стоматолога
    когда первый чел занимает первую кабину (работа стоматолога 15сек) надпись на экран
    что врачь занять и лечит зубы, второй смот
     */


    public static void main(String[] args) {
        ArrayList<Person> list1 = new ArrayList<>();
        list1.add(1, new Person(4,"Den"));
        list1.add(2, new Person(24,"Olga"));
        list1.add(3, new Person(24,"Olga"));
        Dentist stomotolog = new Dentist();
        Dentist stomotolog1 = new Dentist();
//        Person p9 = new Person(45, "Den");
//        Person p1 = new Person(24, "Olga");
//        Person p2 = new Person(77, "Zhanna");
//        Person p3 = new Person(17, "Asia");
//        Person p4 = new Person(20, "iliia");
//        Person p5 = new Person(34, "Kolia");
//        Person p6 = new Person(57, "Anna");
//        Person p7 = new Person(60, "Davit");
//        Person p8 = new Person(6, "Den");
//        Person p10 = new Person(23, "Oleg");


    }
}

class Dentist implements Runnable {

    @Override
    public void run() {
        try {
            sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 5; i++) {


            System.out.println("Я лечу зубы ");
            try {
                sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}

class Person {
    int age;
    String name;


    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;

    }

}