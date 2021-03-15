import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int value;
        do{
            System.out.println("Write 5");
            value = myScanner.nextInt();
        } while (value != 5);



    }



}
