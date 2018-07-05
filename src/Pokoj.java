public class Pokoj {
    /*
        private short numer;
        private byte pietro;
        private int losob;
        private boolean lazienka;
        private boolean zwidokiem;
        private String standard;
        private double cena;
*/


    private int numer;
    private int pietro;
    private int losob;
    private int lazienka;
    private int zwidokiem;
    private String standard;
    private int cena;
    static int liczbaPokoi;

    //Konstruktor
        Pokoj(
                /*short numer,
                byte pietro,
                int losob,
                boolean lazienka,
                boolean zwidokiem,
                String standard,
                double cena
                */

                int numer,
                int pietro,
                int losob,
                int lazienka,
                int zwidokiem,
                String standard,
                int cena
                ) {


            //2 - Informacja o wywolaniu kontruktora
            if(Global.infoWywolanieKonstruktor == true){
                System.out.println("Wywolanie kontruktura - Pokoj");
            }

            this.numer = numer;
            this.pietro = pietro;
            this.losob = losob;
            this.lazienka = lazienka;
            this.zwidokiem = zwidokiem;
            this.standard = standard;
            this.cena = cena;
            this.jestZajety = false;
            liczbaPokoi++;
        }


    private boolean jestZajety;

    public boolean czyZajety() {
        return jestZajety;
    }

    //4 - konstruktor kopiujacy
    Pokoj(Pokoj e){
        this.numer = numer;
        this.pietro = pietro;
        this.losob = losob;
        this.lazienka = lazienka;
        this.zwidokiem = zwidokiem;
        this.standard = standard;
        this.cena = cena;
        this.jestZajety = false;
        liczbaPokoi++;
    }


    void wyswietlInfo() {
        System.out.println("Numer pokoju: " + numer);
        System.out.println("Piętro: " + pietro);
        System.out.println("Maksymalna liczba osób: " + losob);
        System.out.println("Osobna łazieka: " + lazienka);
        System.out.println("Pokój z widokiem: " + zwidokiem);
        System.out.println("Standard: " + standard);
        System.out.println("Cena za dobę: " + cena);
        System.out.println("Zajęty: " + jestZajety);


    }






}




