package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("inserisci l'altezza del rettangolo:");
        int altezza= Integer.parseInt(scanner.nextLine());
        System.out.println("inserisci la base:");
        int base= Integer.parseInt(scanner.nextLine());

        Rettangolo rettangolo= new Rettangolo(base, altezza);

        System.out.println("perimetro = "+ rettangolo.calcolaPerimetro() );
        System.out.println("area = "+ rettangolo.calcolaArea());
        rettangolo.disegna();

        scanner.close();

    }
}
