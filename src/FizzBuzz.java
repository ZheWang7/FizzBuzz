/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {
    public static void main(String[] args) {
        int i = 1;
        while(i < 100) {
            doFizzBuzz(i);
            i++;
        }
    }

    private static void doFizzBuzz(int i) {
        boolean isDiv3 = i % 3 == 0;
        boolean isDiv5 = i % 5 == 0;
        if (isDiv3 && isDiv5) {
            System.out.println("Fizz Buzz");
        } else if (isDiv3) {
            System.out.println("Fizz");
        } else if (isDiv5) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }
}

