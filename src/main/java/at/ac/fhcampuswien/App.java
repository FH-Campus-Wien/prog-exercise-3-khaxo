package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static void oneMonthCalendar(int days, int firstDay) {

        int counter = 0;
        for (int tage = 0; tage <= days; tage++) {

            if (firstDay > 1) {
                System.out.print("   ");
                counter++;
                firstDay--;
                tage = 0;
            } else if (counter == 7) {
                System.out.printf("%n");
                counter = 0;
                tage--;
            } else {
                System.out.printf("%2d ", tage);
                counter++;

            }
        }
        System.out.println();
    }
    //mit Lerngruppe vom 29.10 gelöst

    //todo Task 2

    public static long[] lcg(long x0) {
        long[] randomNumber = new long[10];
        double m = Math.pow(2, 31);
        double a = 1103515245;
        int c = 12345;

        for (int i = 0; i < 10; i++) {

            long x1 = ((long) a * x0 + c) % (long) m;
            x0 = x1;
            randomNumber[i] = x1;
        }
        return randomNumber;

    }       //mit Lerngruppe vom 30.10 gelöst

    //todo Task 3

    public static void guessingGame(int numberToGuess) {

        Scanner scan = new Scanner(System.in);
        for (int i = 1; i < 11; i++) {
            System.out.print("Guess number " + i + ": ");
            int x = scan.nextInt();
            if (i == 10) {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
                break;}
            else if (x == numberToGuess) {
                System.out.println("You won wisenheimer!");
                break;}
            else if (x > numberToGuess) {
                System.out.println("The number AI picked is lower than your guess.");}
            else {
                System.out.println("The number AI picked is higher than your guess.");}
        }

    } //mit Lerngruppe vom 30.10 gelöst

    public static int randomNumberBetweenOneAndHundred() {
        Random r = new Random();
        return r.nextInt(100) + 1;
    }
    //todo Task 4
    public static boolean swapArrays(int[] x1, int[] x2) {
        boolean arrayLength;

        if (x1.length == x2.length) {
            arrayLength = true;
            int[] x3 = new int[x1.length];

            for (int i = 0; i < x1.length; i++) {

                x3[i] = x1[i];
                x1[i] = x2[i];
                x2[i] = x3[i];
            }

        } else {
            arrayLength = false;
        }
        return arrayLength;
    }

    //todo Task 5
    public static String camelCase (String satz) {

        Scanner scan = new Scanner(satz);
        StringBuilder sb = new StringBuilder();

        while (scan.hasNext()) {
            String word = scan.next();
            char[] newWord = word.toCharArray();

            for (int i = 0; i < newWord.length; i++) {
                char letter = newWord[i];
                if ( i == 0 ){
                    if (letter <= 'z' && letter >= 'a') {
                        letter -= 32;
                        sb.append(letter);
                    }
                    else {
                        sb.append(letter);
                    }
                }
                if ( i > 0 ) {
                    if ( letter <='Z' && letter >= 'A'){
                        letter += 32;
                        sb.append(letter);
                    }
                    else if ( letter >= 'a' && letter <= 'z') {
                        sb.append(letter);
                    }
                }
            }
        }
        scan.close();
        return new String(sb);
    }

    //todo Task 6
    public static int checkDigit (int[] code) {

        int summe = 0;

        for (int i = 0; i < code.length; i++){
            int gewichtung = i + 2;
            int produkt = code[i] * gewichtung;
            summe += produkt;
        }
        int x1 = summe%11;
        int pruefziffer = 11 - x1;

        if (pruefziffer == 10) {
            pruefziffer = 0;
        }
        else if (pruefziffer == 11) {
            pruefziffer = 5;
        }

        return pruefziffer;
    }
    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }
}