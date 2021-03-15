import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your age?");
        int age = scanner.nextInt();

        switch (age){
            case 0:
                System.out.println("Hello in the world");
                break;
            case 7:
                System.out.println("School boy");
                break;
            case 18:
                System.out.println("Ended the school");
                break;
            default:
                System.out.println("Non of all");
        }
    }


}

