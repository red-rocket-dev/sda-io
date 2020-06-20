package pl.sda.warmup;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
        1. Napisz kod, ktory wypisze w konsoli prostokąt o wymiarach 5 na 6 złożony z gwiazdek (*)
        Kod powinno się dać łatwo zmodyfikować, żeby uzyskać inne wymiary prostokąta
        Przydadzą się do tego:
        Metody System.out.print i System.out.println
        pętla for lub while
        2. Napisany kod przenieś do metody o sygnaturze:
        public static void printRect(int w, int h)
        gdzie argumenty w i h to kolejno szerokość i wysokość prostokąta do narysowania
        3. Napisz kod, który wypisze w konsoli PUSTY W ŚRODKU prostokąt o wymiarach 5 na 6 złożony z gwiazdek (obwódka)
        i spacji w środku, dodatkowo przyda się do tego konstukcja "if"
        4. Napisany kod przenieś do metody o sygnaturze:
        public static void printEmptyRect(int w, int h)
        5. Czy można uprościć w myśl DRY (don't repeat yourself)
        Prostokąt o wymiarach 5 na 6 powinien wyglądać tak:

         *****
         *****
         *****
         *****
         *****
         *****
        Pusty prostokąt o wymiarach 5 na 6 powinien wyglądać tak:

         *****
         *   *
         *   *
         *   *
         *   *
         *****

         */

        System.out.println("Podaj bok kwadratu");
        //Scanner scanner = new Scanner(System.in);
        //int squareSize = scanner.nextInt();

        String squareSizeContents = Files.readString(Path.of("squareSize.txt"));
        int squareSize = Integer.parseInt(squareSizeContents);
        BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of("square.txt"));
        for (int x = 0; x < squareSize; x++) {
            for (int y = 0; y < squareSize; y++) {
                bufferedWriter.write("*");
                //System.out.print("*");
            }
            bufferedWriter.write("\n");
            //System.out.println();
        }
        bufferedWriter.close();
    }
}
