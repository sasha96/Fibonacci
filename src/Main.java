import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     List<Integer> setFibonaccis  = searchFibonacci(13);
        for (Integer setFibonacci:setFibonaccis) {
            System.out.println(setFibonacci);
        }
    }

    public static List<Integer> searchFibonacci(int maxNumber) {
        int number1 = 1;
        int number2 = 1;
        List<Integer> setFibonacci = new ArrayList<>();
        setFibonacci.add(number1);
        setFibonacci.add(number2);
        boolean exucute = true;
        while (exucute) {
            int amount = number1 + number2;
            number2 = number1;
            number1 = amount;
            if (amount > maxNumber) {
                exucute = false;
            }else {
                setFibonacci.add(amount);
            }
        }
        return setFibonacci;
    }
}
