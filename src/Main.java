import java.util.Scanner;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sortowanie przez wybór");
        System.out.println("Czy chcesz aby wylosować liczby czy je wpisać?");
        System.out.println("Wpisz 1 dla losowania lub inną cyfrę od 1 aby wpisać liczby");

        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();
        System.out.println("Wpisz jaki ma być rozmiar tablicy");
        int sizeOfArray = scanner.nextInt();
        double[] doubleArray = new double[sizeOfArray];
        if (userChoice.equals("1")) {
            for (int i = 0; i < sizeOfArray; i++) {
                System.out.println("Wpisz jaki chcesz mieć zakres liczb");
                int choiceFirst = scanner.nextInt();
                int choiceLast = scanner.nextInt();
                doubleArray[i] = (double) (int) (random() * 10000) / 100;
            }
        } else {
            System.out.printf("Wpisz kolejne %d liczb oddzielonych enterami\n", sizeOfArray);
            for (int i = 0; i < sizeOfArray; i++) {
                doubleArray[i] = scanner.nextDouble();
                scanner.nextLine();
            }
        }
        System.out.println("Przed sortowaniem");
        for (double itr : doubleArray) System.out.println(itr + ", ");

        System.out.println("Po sortowaniu");
        for (double element : selectionSort(doubleArray)) {
            System.out.println(element);
        }
//
//
//        double[] arrayNumber1 = {100, 14, 1, 6, 29, 11, 58, 28};
//        System.out.println("Przed posortowaniem");
//        for (double i : arrayNumber1) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        selectionSort(arrayNumber1);
//
//        System.out.println("Po posortowaniu");
//        for (double i : arrayNumber1) {
//            System.out.print(i + " ");
//        }


    }

    public static double[] selectionSort(double[] arrayNumber) {
        double temp;
        for (int i = 0; i < arrayNumber.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arrayNumber.length; j++) {
                if (arrayNumber[j] < arrayNumber[index]) {
                    index = j; //znajdowanie najmniejszego indeksu
                }
            }
            temp = arrayNumber[index];
            arrayNumber[index] = arrayNumber[i];
            arrayNumber[i] = temp;
        }
        return arrayNumber;
    }
}