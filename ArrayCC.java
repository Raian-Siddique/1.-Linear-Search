
// /**
// * linearSearch
// */
// import java.util.*;;

// public class linearSearch {

// /**
// * ArrayCC
// *
// */
// public class ArrayCC {
// public static int linearSearch(int numbers[], int key) {

// for (int i = 0; i < numbers.length; i++) {
// if (numbers[i] == key) {
// return i;

// }

// }
// return -1;

// }

// public static void main(String[] args) {
// int numbers[] = { 2, 3, 4, 5, 6, 8, 12, 14, 16, 18 };
// int key = 10;

// int index = linearSearch(numbers, key);
// if (index == -1) {
// System.out.println("Not found");

// } else {
// System.out.println("Key is at Index: " + index);
// }

// }
// }

//======================================

public class ArrayCC {

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 4, 5, 6, 8, 12, 14, 16, 18 };
        int key = 12;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Not Found");

        } else {
            System.out.println("Key is at index: " + index);
        }
    }

}