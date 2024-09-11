import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //tablica
        //musi miec z gory okreslony rozmiar
        //nie mozna go pozniej zmienic
        //elementem tablicy moga byc typy proste i zlozone
        //tablice 6 elemetnowa z wartosacmi loswymi z zkaresu 1 do 100
        int tablicaLosowych[] =new int[6];
        for (int i = 0; i < tablicaLosowych.length; i++) {
            tablicaLosowych[i] = (int)(Math.random()*100+1);
        }
        //wypisywanie elemtnow talblicy
        for (int element: tablicaLosowych) {
            System.out.print(element+", ");
        }
        //kolekcje elementy typami zlozonymi
        //nie musza miecc odrazu zdefiniowanego rozamiaru
        //rozmiar w trakcie moze sie zmieniac
        //listy List, zbiory Set, mapy

        //wstawsainie liczb z klawiatury do kolekcji
        List<Integer> ListaLiczbPisanych = new ArrayList<>();
        System.out.println("Podaj 6 liczb");
        Scanner Klawiatura = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            int liczba = Klawiatura.nextInt();
            ListaLiczbPisanych.add(liczba);
        }
        for(Integer element:ListaLiczbPisanych) {
            System.out.print(element+" ");
        }
        //wypisywanie inaczej
        for (int i = 0; i < ListaLiczbPisanych.size(); i++) {
            System.out.println(ListaLiczbPisanych.get(i));
        }
        //Loswanie liczb bez powtorzen
        ArrayList <Integer> listaLosowychBezPowtorzen = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int liczba = (int)(Math.random()*100+1);
            while(listaLosowychBezPowtorzen.contains(liczba)){
                liczba = (int)(Math.random()*100+1);
            }
            listaLosowychBezPowtorzen.add(liczba);
        }
        for(Integer element:listaLosowychBezPowtorzen) {
            System.out.print(element+" ");
        }
        //wypisywanie
        System.out.println("Wylosowane bez powtorzen");
        System.out.println(listaLosowychBezPowtorzen);
    }
}