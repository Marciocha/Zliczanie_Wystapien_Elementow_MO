package com.sdajava.zliczanie_wystapien_elementow;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe, ktora chcesz sprawdzic: ");

        int n = scanner.nextInt();

        int[] a = {4, 1, 6, 1, 1};

        int wynik = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                wynik = wynik + 1;
            }
        }
        System.out.println("Wartosc: " + n + " wystepuje: " + wynik + "razy");
    }
}
