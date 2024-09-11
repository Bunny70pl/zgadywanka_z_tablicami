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
    }
}