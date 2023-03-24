package org.example;
import javax.swing.*;
import java.util.Scanner;
public class WhatToWear {
    public static void main(String[] args) {
        //        Greet the user and ask what the weather is like
        System.out.println("Hello! Tell me what the weather is like right now and I'll recommend an outfit");
        System.out.println("First of all, what is the temperature? Give an integer for degrees celsius");

        //        Accept input for the temperature
        Scanner reader = new Scanner(System.in); //creates scanner object
        int Temperature = reader.nextInt();

//      Prompt the weather input
        System.out.println("Great! Now, is it sunny, rainy or cloudy? Please just pick one :)");
//        Accept input for the weather type
        Scanner reader2 = new Scanner(System.in);
        String Weather = reader2.nextLine();
//        Convert the string to lower case
        String weather = Weather.toLowerCase();

        // Split temperature into <10 degrees, <20 degrees and <30 degrees
        if (Temperature < 10) {
            System.out.println("Wear a warm coat");
        } else if (Temperature < 20) {
            System.out.println("Wear a light jacket");
        } else if (Temperature < 30) {
            System.out.println("Wear a t-shirt");
        } else if (Temperature > 30) {
            System.out.println("Wear a tank top");


        if (weather.equals("sunny")) { System.out.println("...and wear sunglasses B)");
        } else if (weather.equals("rainy")) {
                System.out.println("...and bring an umbrella :')");
          } else if (weather.equals("cloudy")) {
            System.out.println("...and you're done!");
        }
            else {
            System.out.println("Hope this helps!");
        }
            }
    }
}
