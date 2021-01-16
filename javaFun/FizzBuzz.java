public class FizzBuzz {

    public static void main(String[]args) {
        fizzBuzz();
    }

    public static void fizzBuzz() {
        for(int iteration = 1; iteration <= 100; iteration++) {
            int currentNumber = iteration;
            boolean isDivisibleBy3 = (currentNumber % 3 == 0);
            boolean isDivisibleBy5 = (currentNumber % 5 == 0);
            boolean isDivisibleByBoth3and5 = isDivisibleBy3 && isDivisibleBy5;

            if(isDivisibleByBoth3and5) {
                System.out.println("FizzBuzz");
            } else if(isDivisibleBy3) {
                System.out.println("Fizz");
            } else if(isDivisibleBy5) {
                System.out.println("Buzz");
            } else {
                System.out.println(currentNumber); 
            }
        }
    }
}