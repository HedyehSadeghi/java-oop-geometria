package org.lessons.java.geometria;

public class Rettangolo {
    //ATTRIBUTI
    int base;
    int altezza;


    //COSTRUTTORI
    Rettangolo(int base, int altezza){
        this.base= base;
        this.altezza=altezza;
        System.out.println("base = "+ this.base +"\naltezza = "+ this.altezza);
    }

    //METODI
    int calcolaArea(){
        int area= base*altezza;
        return area;

    }

    int calcolaPerimetro(){
        return (base*2)+(altezza*2);
    }

    void disegna(){
        for (int i=0; i<altezza; i++){
            String linea= "";
            if((i==0) || (i==altezza-1)){
                for (int j = 0; j <base ; j++) {
                    linea += "0";
                }
                System.out.println(linea);
            } else{
                linea="0";
                for (int j = 0; j <base-2 ; j++) {
                    linea+= " ";
                }
                linea += "0";
                System.out.println(linea);
            }
        }


    }
}
