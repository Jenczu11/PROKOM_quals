import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    private static void b_sort(int tab[]){
        int temp;
        int zmiana = 1;
        while(zmiana > 0){
            zmiana = 0;
            for(int i=0; i<tab.length-1; i++){
                if(tab[i]>tab[i+1]){
                    temp = tab[i+1];
                    tab[i+1] = tab[i];
                    tab[i] = temp;
                    zmiana++;
                }
            }
        }

    }
    public static String newline = System.getProperty("line.separator");
    public static void main(String[] args) {

        //<editor-fold desc="main 3/ main 7">
        //        if(args.length<3) {
//            System.err.print("Za malo argumentow");
//            System.exit(0);
//        }
//        // drukowanie Pierwszego argumentu wywolania
//        System.out.println(args[0]);
//
//        // drukowanie DRUGIEGO i TRZECIEGO argumentu wywolania
//        System.out.println(args[1]+" | "+args[2]);
//
//
//
//        // Zabezpieczenie przed niewlasciwa iloscia argumentow
//
//        if (args.length <3)
//            System.err.print("Za malo argumentow");
//        else
//            System.out.println(" * " + args[0]+" ** "+args[1]+" *** "+args[2]);
//
//
//
//        // Drukowanie kazdej podanej ilosci argumentow
//        int i;
//        for (i=0; i<args.length; i++) // ilosc argumentow jako ograniczenie gorne petli
//            System.out.println(args[i]);
//
        //</editor-fold>

        //<editor-fold desc="Main dwie liczby i dzielenie">
        //Main dwie liczby i dzielenie
        // Wprowadzanie liczb przez okna dialogowe
//        String txt1; //deklaracja zmiennej tekstowej
//        txt1 = JOptionPane.showInputDialog("Wprowadz pierwsza liczbe");
//
//        String txt2; //deklaracja zmiennej tekstowej
//        txt2 = JOptionPane.showInputDialog("Wprowadz druga liczbe");
//
//        System.out.println(txt1 + txt2); // ???


        // Konwersja tekstu na liczbe
//        double liczba1 = Double.parseDouble(args[0]);
//        double liczba2 = Double.parseDouble(args[2]);
//        Calculator calculator = new Calculator();
////        System.out.println(calculator.div(liczba1,liczba2));
//        System.out.println(args[1]);
//        String test = args[1];
//        System.out.println(test);
//        if (args[1] == test) {
//            System.out.println("Wchodze do ifa");
////            System.out.println(liczba1 / liczba2);
//            System.out.println(calculator.div(liczba1,liczba2));
//        }
        //</editor-fold>

        //<editor-fold desc="Kolejne nudne zadanie">
        //        int i;
//
//        // Deklaracja tablicy
//        int tab[] =new int[10];
//
//        // Wypelnianie tablicy takimi samymi wartosciami
//        for (i=1; i<10; i=i+1)
//            tab[i] = 5;
//
//        // Drukowanie zawartosci tablicy
//        for (i=1; i<10; i=i+1)
//            System.out.print(tab[i]+" ");
//
//        System.out.println("");  // wydruk pustego wiersza
//
//        // Wypelnianie tablicy wartosciami zaleznymi od `i'
//        for (i=1; i<10; i=i+1)
//            tab[i] = 2*i;
//        //  tab[i] = 5*i+3
//        // 	tab[i] = 20 -i
//
//
//        // Tablice o dynamicznie ustalanym rozmiarze
//        int rozmiar = 15; //
//        int tablica_inna[] =new int[rozmiar];
//
//        for (i=0; i< rozmiar; i++) {
//            tablica_inna[i] = 20-2*i;
//            System.out.print(tablica_inna[i]+" ");
//        }
//
//        System.out.println("");
//
//
//        // Wypelnianie tablicy liczbami losowymi
//
//        for (i=0; i< rozmiar; i++)
//            tablica_inna[i] = (int)(Math.random()*20);
//
//        for (i=0; i< rozmiar; i++)
//            System.out.print(tablica_inna[i]+" ");
//
//        System.out.println("");
//
//
//
//        // Wypelnianie tablicy liczbami losowymi z dynamicznie ustalanego zakresu
//
//        int zakres = 30;
//        for (i=0; i< rozmiar; i++)
//            tablica_inna[i] = (int)(Math.random()*zakres);
//
//        for (i=0; i< rozmiar; i++)
//            System.out.print(tablica_inna[i]+" ");
//
//        System.out.println("");
        //</editor-fold>

        String txt1;

        txt1 = JOptionPane.showInputDialog("Wprowadz rozmiar tablicy");
        int rozmiar= Integer.parseInt(txt1);
        int tablica[] = new int [rozmiar];
        int tablica1[] = new int [rozmiar];
        int i;
        int zakres = Integer.parseInt(args[0]);
        for (i=0; i< rozmiar; i++)
            tablica[i] = (int)(Math.random()*zakres);

        tablica1=tablica;
//        for (i=0; i< rozmiar; i++)
//            System.out.print(tablica[i]+" ");
//        System.out.print(newline);
        Date przed = new Date();

        b_sort(tablica);

        Date po = new Date();

        System.out.println("Czas operacji "+(po.getTime() - przed.getTime()) +"ms");

        System.out.print(newline);

        Date przed1 = new Date();

        Arrays.sort(tablica1);

        Date po2 = new Date();

        System.out.println("Czas operacji "+(po2.getTime() - przed1.getTime()) +"ms");

    }
}
