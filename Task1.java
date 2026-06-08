package Part1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        boolean indicator = true;
        for (int i = 0; i < size - 1; i++) {
            if (array[i] > array[i + 1]) {
                indicator = false;
                break;
            }
        }

        System.out.println(indicator);
        System.out.println("5" + 5 + 5);
        scanner.close();
    }
}