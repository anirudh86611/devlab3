public class BugExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // BUG: Off-by-one error — this will throw ArrayIndexOutOfBoundsException
        for (int i = 0; i <= numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
