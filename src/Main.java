import java.util.*;

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
        ArrayList<Integer> ListaLiczbPisanych = new ArrayList<>();
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
        //wypisywanie
        System.out.println("Wylosowane bez powtorzen");
        System.out.println(listaLosowychBezPowtorzen);

        //Losowanie bez powtorzen do zbioru
        HashSet<Integer> zbiorLiczbLosowych = new HashSet<>();
        while(zbiorLiczbLosowych.size()<6){
            int liczba = (int)(Math.random()*100+1);
            zbiorLiczbLosowych.add(liczba);
        }
        System.out.println(zbiorLiczbLosowych);

        //lista
        /*
        elementy moga sie powtarzac
        elemnty sa indeksowane
         */
        //zbior zazwyczaj
        /*
        elementy unikatowe
         elementy nie sa indeksowane

         */

        LinkedList<Integer> trafione = new LinkedList<>();
        //trafione to elementy ktore wystepuja w wylosownach i w wpisanch
        for (int i = 0; i < zbiorLiczbLosowych.size(); i++) {
            if(zbiorLiczbLosowych.contains(ListaLiczbPisanych.get(i))){
                trafione.add(ListaLiczbPisanych.get(i));
            }
        }
        System.out.println("Trafone: ");
        for (int element:trafione) {
            System.out.print(element+ " ");
        }
    }

    /**
     * Metoda wylosuj liczby losuje liczby calkowite z zakresu 1-100 bez powtorzen paramterem
     * @param ile  to zmienna calkowita przechowujaca ile liczb wylosujemy
     * @return zwaracmy liste z wylosowanymi liczbami
     */
    //metody
    //Loswanie liczb bez powtorzen
    private ArrayList<Integer> wylosujLiczby(int ile){
        ArrayList <Integer> listaLosowychBezPowtorzen = new ArrayList<>();
        for (int i = 0; i < ile; i++) {
            int liczba = (int)(Math.random()*100+1);
            while(listaLosowychBezPowtorzen.contains(liczba)){
                liczba = (int)(Math.random()*100+1);
            }
            listaLosowychBezPowtorzen.add(liczba);
        }
        return listaLosowychBezPowtorzen;
    }
    private ArrayList<Integer> wpiszLiczbyZKlawiatury(int ile){
        ArrayList<Integer> ListaLiczbPisanych = new ArrayList<>();
        System.out.println("Podaj 6 liczb");
        Scanner Klawiatura = new Scanner(System.in);
        for (int i = 0; i < ile; i++) {
            int liczba = Klawiatura.nextInt();
            ListaLiczbPisanych.add(liczba);
        }
        return ListaLiczbPisanych;
    }
    private void wypiszKolekcje(List<Integer> listaDoWypisania){
        for (Integer element:listaDoWypisania) {
            System.out.println(element);
        }
    }
    private LinkedList<Integer> zwrocTrafione(ArrayList<Integer> listaLiczbWpisanych,ArrayList<Integer>listaLiczbLosowych){
        LinkedList<Integer> trafione = new LinkedList<>();
        for (int i = 0; i < listaLiczbLosowych.size(); i++) {
            if(listaLiczbLosowych.contains(listaLiczbWpisanych.get(i))){
                trafione.add(listaLiczbWpisanych.get(i));
            }
        }
        return trafione;
    }
}