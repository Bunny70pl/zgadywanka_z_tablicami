import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gra {
    private static ArrayList<Integer> wylsowoane = new ArrayList<>();;
    private ArrayList<Integer> wpisane;
    private LinkedList<Integer> trafione;

    private void wylosujLiczby(int ile){
        while(wylsowoane.size()<ile){
            int liczba = (int)(Math.random()*100+1);
            while(wylsowoane.contains(liczba)){
                liczba = (int)(Math.random()*100+1);
            }
            wylsowoane.add(liczba);
        }
    }
    private void wpiszLiczbyZKlawiatury(int ile){
        wpisane = new ArrayList<>();
        System.out.println("Podaj 6 liczb");
        Scanner Klawiatura = new Scanner(System.in);
        for (int i = 0; i < ile; i++) {
            int liczba = Klawiatura.nextInt();
            wpisane.add(liczba);
        }
    }
    private void wypiszKolekcje(List<Integer> listaDoWypisania){
        for (Integer element:listaDoWypisania) {
            System.out.println(element + " ");
        }
    }
    private void zwrocTrafione(){
         trafione = new LinkedList<>();
        for (int i = 0; i < wylsowoane.size(); i++) {
            if(wylsowoane.contains(wpisane.get(i))){
                trafione.add(wpisane.get(i));
            }
        }
    }
    public void zagraj(){
        wylosujLiczby(6);
        wpiszLiczbyZKlawiatury(6);
        zwrocTrafione();
        System.out.println("Wpisano: ");
        wypiszKolekcje(wpisane);
        System.out.println("Wylosowano:");
        wypiszKolekcje(wylsowoane);
        System.out.println("Trafiono: ");
        wypiszKolekcje(trafione);
    }
}
