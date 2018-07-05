import java.util.Scanner;

public class Menu {

     static void wyswietlMenu() {
        System.out.println("System rezerwacji hotelowej - v0.1a");
        System.out.println("Wybierz opcję:");
        System.out.println("1 - wprowadzanie danych");
        System.out.println("2 - wyswietlanie danych");

        System.out.println("3 - sprawdz dostepnosc pokoi");
        System.out.println("4 - dokonaj rezerwacji pokoju");

        System.out.println("0 - wyjscie");
         wyborMenu();
    }


      static void wyborMenu() {
        Scanner scan = new Scanner(System.in);
        int wybor = scan.nextInt();

        //DEBUG
        //System.out.println("Wybor: " + wybor);

        switch (wybor) {

            case 0:                             //Wyjscie z programu
                System.exit(1);
            case 1:                             //Wprowadzanie danych
                wprowadzanieDanych();
                break;
            case 2:                             //Wyswietlenie danych
                //Hotel hotel = new Hotel();
                //hotel.wyswietlHotel();

                //Hotel.wyswietlHotel();
                break;
            case 3:
                //sprDostepnosc();
                break;
            case 4:
                //rezerwPokoj();
               break;
                default:
                System.out.println("Błędny wybór");
                wyswietlMenu();
                wyborMenu();


        }
    }

     static void wprowadzanieDanych() {
        System.out.println("Wprowadzanie danych");
        System.out.println("Liczba pokoi w systemie:  " + Pokoj.liczbaPokoi);


        //System.out.println("Podaj dane klienta");
        Pokoj Pok = new Pokoj(
                wczytajLiczbe("numer"),
                wczytajLiczbe("pietro"),
                wczytajLiczbe("losob"),
                wczytajLiczbe("lazienka"),
                wczytajLiczbe("zwidokiem"),
                wczytajStringa("standard"),
                wczytajLiczbe("cena")
        );

        // System.out.println("Dodano klienta: " + Pokoj);
        wyswietlMenu();
    }


     static String wczytajStringa(String nazwaPola) {
        System.out.print("Podaj " + nazwaPola + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    static int wczytajLiczbe(String nazwaPola) {
        System.out.print("Podaj " + nazwaPola + ": ");
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }



}
