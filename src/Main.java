import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        int output = findNumberOfOneBits(number);
        System.out.println("Output : " + output);
    }

    private static int findNumberOfOneBits(int number) {
        int count = 0;
        for (int i = 0; i < 32; i++){
            if (checkBit(number, i)){
                count++;
            }
        }
        return count;
    }

    private static boolean checkBit(int number, int index) {
        if ((number & (1 << index)) == 0){
            return false;
        }
        else{
            return true;
        }
    }
}