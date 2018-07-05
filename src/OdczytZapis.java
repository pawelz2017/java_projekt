import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class OdczytZapis {

    static void odczytPliku(){


        //Import danych z pliku CSV
        String csvFile = "src/hotel.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";


        try {
            long countOfLines = Files.lines(Paths.get(new File(csvFile).getPath())).count();

            Hotel hotel = new Hotel((int) countOfLines - 1); //bez naglowka

            br = new BufferedReader(new FileReader(csvFile));

            boolean pominPierwszaLinie = true;
            int czytanaLinia = 0;
            while ((line = br.readLine()) != null) {
                if (pominPierwszaLinie) {
                    pominPierwszaLinie = false;
                    continue;
                }

                String[] slowo = line.split(cvsSplitBy);

                Pokoj pokoj = new Pokoj(
                        Integer.parseInt(slowo[0].trim()),
                        Integer.parseInt(slowo[1].trim()),
                        Integer.parseInt(slowo[2].trim()),
                        Integer.parseInt(slowo[3].trim()),
                        Integer.parseInt(slowo[4].trim()),
                        slowo[5].trim(),
                        Integer.parseInt(slowo[6].trim())
                );

                hotel.dodajPokoj(pokoj, czytanaLinia);
                czytanaLinia++;


            }

            hotel.wyswietlHotel();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    static void zapiszDoPliku(double srednia, double mediana) throws IOException {
        // zapisuje do pliku medianę i średnią
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("wynik.txt");

            fileWriter.write("Mediana: " + mediana);
            fileWriter.write("Średnia: " + srednia);

        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }


}
