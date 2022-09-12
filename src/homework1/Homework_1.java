/**
 * Java Pro. Homework #1
 * @author Alexej Lange
 * @version 12 Sep 2022
 */

/*
Given an array arr[] of N elements,
the challenge is to write a function to find a given element x in arr[]
*/

package homework1;

public class Homework_1 {
    public static void main(String[] args) {
        int[] array = {56, 17, 34, 89, -96, 1, -15, 14};
        int number = 11;
        System.out.println(elementSearch(array, number));
        if (elementSearchB(array, number)) {
            System.out.println("Элемент " + number + " есть в массиве.");
        } else {
            System.out.println("Элемента " + number + " нет в массиве.");
        }
    }

    public static Integer elementSearch(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) return i;
        }
        return null;
    }

    public static boolean elementSearchB(int[] array, int number) {
        for (int i : array) {
            if (i == number) return true;
        }
        return false;
    }
}
