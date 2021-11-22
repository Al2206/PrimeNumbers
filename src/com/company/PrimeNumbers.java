// Написать программу которая находит все простые числа в диапазоне от a до b, и выводит их в консоль.
// Диапазон чисел пользователь вводит с клавиатуры
package com.company;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int a = 0, b = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a :");
        a = in.nextInt();
        System.out.println("Введите число b :");
        b = in.nextInt();
        for (int i = a; i <= b; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();
    }
}

