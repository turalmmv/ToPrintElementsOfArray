package myPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Birinci Arrayin size ini daxil edin: ");
        byte sizeOne = sc.nextByte();
        System.out.println("Ikinci Arrayin size ini daxil edin: ");
        byte sizeTwo = sc.nextByte();

        int[] myArray = new int[sizeOne];
        int[] mySecondArray = new int[sizeTwo];
        System.out.println("Birinci Arrayin elementlerini daxil edin: ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = sc.nextInt();
        }
        System.out.println("Ikinci Arrayin elementlerini daxil edin: ");
        for (int i = 0; i < mySecondArray.length; i++) {
            mySecondArray[i] = sc.nextInt();
        }
        sc.close();
        //  SameElementsOfArray(myArray,mySecondArray);
        // System.out.println(SameElements(myArray, mySecondArray));
        // CommonElements(myArray,mySecondArray);
        //DifferentElements(myArray,mySecondArray);

       // NotSameElements(myArray, mySecondArray);

        */
        Integer[] array={1,2,3,4,0,0,0,0,9,10};
        ChangeZerosWithNull(array);
    }

    public static void SameElementsOfArray(int[] arrayOne, int[] arrayTwo) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                if (arrayOne[i] == arrayTwo[j]) {
                    str.append(arrayOne[i] + " ");
                }
            }
        }

        System.out.println(str.toString());
    }

    public static void CommonElements(int[] arrayOne, int[] arrayTwo) {
        int[] newArray = new int[arrayOne.length + arrayTwo.length];
        int counter = 0;

        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                if (arrayOne[i] == arrayTwo[j]) {
                    newArray[counter] = arrayOne[i];
                    counter++;
                }
            }
        }

        for (int i = 0; i < newArray.length; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[i] == newArray[j]) {

                    newArray[j] = 0;
                }
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] != 0) {
                System.out.println(newArray[i] + " ");
            }
        }

    }

    public static ArrayList<Integer> SameElements(int[] arrayOne, int[] arrayTwo) {
        ArrayList<Integer> commonElements = new ArrayList<Integer>();
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                if (arrayOne[i] == arrayTwo[j] && !commonElements.contains(arrayOne[i])) {
                    commonElements.add(arrayOne[i]);
                }
            }
        }
        return commonElements;
    }

    public static void DifferentElements(int[] arrayOne, int[] arrayTwo) {
        System.out.print("Different elements: ");
        for (int i = 0; i < arrayOne.length; i++) {
            boolean isDifferent = true;
            for (int j = 0; j < arrayTwo.length; j++) {
                if (arrayOne[i] == arrayTwo[j]) {
                    isDifferent = false;
                    break;
                }
            }
            if (isDifferent) {

                System.out.print(arrayOne[i] + " ");
            }
        }
        for (int j = 0; j < arrayTwo.length; j++) {
            boolean isDifferent = true;
            for (int i = 0; i < arrayOne.length; i++) {
                if (arrayTwo[j] == arrayOne[i]) {
                    isDifferent = false;
                    break;
                }
            }
            if (isDifferent) {
                System.out.print(arrayTwo[j] + " ");
            }
        }
    }

    public static int[] NotSameElements(int[] arrayOne, int[] arrayTwo) {
        int[] newArray = new int[arrayOne.length + arrayTwo.length];
        int counter = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            boolean isDifferent = true;
            for (int j = 0; j < arrayTwo.length; j++) {
                if (arrayOne[i] == arrayTwo[j]) {
                    isDifferent = false;
                    break;
                }
            }
            if (isDifferent) {
                newArray[counter] = arrayOne[i];
                counter++;
            }
        }
        for (int j = 0; j < arrayTwo.length; j++) {
            boolean isDifferent = true;
            for (int i = 0; i < arrayOne.length; i++) {
                if (arrayTwo[j] == arrayOne[i]) {
                    isDifferent = false;
                    break;
                }
            }
            if (isDifferent) {
                newArray[counter] = arrayTwo[j];
                counter++;
            }
        }
        System.out.print("Different elements: ");
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] != 0)
                System.out.print(newArray[i] + " ");
        }
        newArray=RemoveZeros(newArray);
        return newArray;
    }
    public static int[] RemoveZeros(int[] array){
        int newSize=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=0) newSize++;
        }
        int[] newArray= new int[newSize];
        int index=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=0)
                newArray[index]=array[i];
            index++;
        }
        return newArray;
    }
    public static void ChangeZerosWithNull(Integer[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0)
                arr[i]=null;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=null)
            System.out.print(arr[i]+" ");
        }
      //  System.out.println(Arrays.toString(arr));
    }
}
