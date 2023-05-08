package app.kudzy.service;

public class FabonacciServiceImpl implements FabonacciService {



    @Override
    public String fabonacciSequenceCreator(Number maxNumber) {
        int previousNumber = 0;
        int nextNumber = 1;
        String str = "";
        System.out.print("Fibonacci Series of " + maxNumber + " numbers:");

        for (int i = 1; i <= (int) maxNumber; ++i) {
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            if ((int) nextNumber <= (int) maxNumber && (int) nextNumber > 0) {
                str += ", " + nextNumber;
            }
        }
        return str;
    }
}
