package com.plurealsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Quotes
        String[] favoriteQuotes = {
                "So live your life that the fear of death never enters your heart",
                "Better out than in I always say",
                "Sorry, Amanai. I'm not even angry over you right now.",
                "You are the knife I turn inside myself; that is love. That, my dea, is love",
                "Whoever values peace of mind and the health of the soul will live the best of all possible lives",
                "A journey of a thousand miles must begin with a single step",
                "Waste no more time arguing about what a good man should be. Be one.",
                "When you arise in the morning think of what a privilege it is to be alive, to think, to enjoy, to love",
                "It does not matter how slowly you go as long as you do not stop",
                "Our greatest glory is not in never falling, but in rising every time we fall"
        };

        // Setting a selector
        System.out.println("Enter 1 - 10 to display a quote: ");
        int quoteIndex = inputScanner.nextInt();

        System.out.println(favoriteQuotes[quoteIndex]);
    }
}
