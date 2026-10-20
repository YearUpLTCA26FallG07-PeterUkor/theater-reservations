package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt user for input
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String date = input.nextLine();
        System.out.print("How many tickets would you like: ");
        String ticketCount = input.nextLine();

        // handle name
        String[] nameArray = name.split(" ");
        String firstName = nameArray[0];
        String lastName = nameArray[1];

        // handle date
        // create a DateTimeFormatter to handle the date format MM/dd/yyyy
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate newDateFormat = LocalDate.parse(date, formatter);

        // handle ticket count
        // trim and parse string to int
        String ticketPluralization = "ticket";
        if (Integer.parseInt(ticketCount.trim()) > 1) {
            ticketPluralization = "tickets";
        }

        System.out.printf("%s %s reserved for %s under %s, %s%n",
                ticketCount, ticketPluralization,
                newDateFormat, lastName, firstName);

    }
}
