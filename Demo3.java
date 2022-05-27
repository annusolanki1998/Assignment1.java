import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string");
        String string1 = scanner.nextLine();
        System.out.println("Enter second string");
        String string2 = scanner.nextLine();
        if (string1.equals(string2)){
            System.out.println("String is equal");
        }
        else{
            System.out.println("String is not equal");
        }
    }
}
