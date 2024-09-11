import java.util.*;

public class Main {
    public static void main(String[] args) {

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