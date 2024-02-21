package com.GitTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Напишите своё имя : ");
        String name = console.nextLine();
        System.out.println("Рады вас приветствовать: " + name);


    }
}
