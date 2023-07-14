package ParameterizedArray;

import java.util.Scanner;

public class Main {

    public static String checkEnteredIndex(int index, String[] strArr, Integer[] numsArr) {
        if(index < 0 && index > numsArr.length - 1) {
            return "Read the condition again please.";
        } else {
            return "you selected " + strArr[index] + "which costs " + numsArr[index];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strArray = {"Apple", "Banana", "Cherry", "Grapes", "Mango"};
        Integer[] numArray = {234, 56, 23, 45, 89};

        ParameterizedArray<String> stringArray = new ParameterizedArray<String>();
        ParameterizedArray<Integer> numbersArray = new ParameterizedArray<Integer>();

        stringArray.setArray(strArray);
        numbersArray.setArray(numArray);

        System.out.println("Enter number from 0 to 4");
        int enteredNumber = scanner.nextInt();

        System.out.println(checkEnteredIndex(enteredNumber, strArray, numArray));
    }
}
