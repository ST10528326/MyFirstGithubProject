package com.mycompany.myfirstgithubproject;

import java.util.Scanner;

public class MyFirstGithubProject {

    public static void main(String[] args) {
        String display = "\nHey " + userInput() + ", lock in fn!";
        System.out.println(display);
        
    }
    
    public static String userInput(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter name: ");
        String name = input.nextLine();
        
        System.out.println("Enter surname: ");
        String surname = input.nextLine();
        
        String fullName = name + " " + surname;
        
        return fullName;
    }
}
