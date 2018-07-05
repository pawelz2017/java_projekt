public class Main {



    public static void main(String[] args) {
/*
        // 1 - Struktura do projektu

                Kurort
                /	\
       Restauracje	Hotele
					|--------------------Hotel nr 1-------------------------
                        |	|-Kuchnia	|-Sprzątaczki		|-Pokoje	|-Konserwatorzy
                             |									/	\
							|						Apartamenty		Ekonomiczne

*/
        //Zaimportowanie danych z pliku CSV
        OdczytZapis.odczytPliku();

        //Wywolanie menu; wybor opcji
        Menu.wyswietlMenu();




/*
        //Dodawnie pokoi
        Pokoj pokoj = new Pokoj((short) 100, (byte)1, 1, true, true, "standard", 100.0);
        Pokoj pokoj2 = new Pokoj((short) 101, (byte)1, 1, true, true, "standard", 100.0);

        pokoj.wyswietlInfo();
        pokoj2.wyswietlInfo();

*/
    }


}
