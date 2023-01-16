import java.util.Arrays;

public class Twice {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int[] result = Arrays.stream(numbers)
                .map((item) -> item*2)
                .toArray();

        System.out.println("result = " + result);


    }
}
