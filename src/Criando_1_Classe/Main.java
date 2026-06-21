package Criando_1_Classe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var male = new Person("João");
        //Por causa do construtor crio o nome na criação do objeto,não por um GET



        var female = new Person("Maria");


        System.out.println("Male name: " + male.getName() + " Age: " + male.getAge());
        System.out.println("Female name: " + female.getName() +  "  Age: " + female.getAge());
    }
}
