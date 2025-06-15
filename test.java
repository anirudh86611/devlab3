import java.util.*;  // Commonly used utility import (not required here but shown for structure)

public class BugExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // BUG: Off-by-one error – will cause ArrayIndexOutOfBoundsException
        for (int i = 0; i <= numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
