public class Hotel  {

    private Pokoj[] spisPokoi;

    Hotel(int liczba) {
        spisPokoi = new Pokoj[liczba];
    }

    void dodajPokoj(Pokoj pokoj, int index) {
        spisPokoi[index] = pokoj;
    }

    void wyswietlHotel() {
        for (int i = 0; i < spisPokoi.length; i++) {
            spisPokoi[i].wyswietlInfo();
            System.out.println();
        }
    }

}
