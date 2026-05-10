import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = scanner.nextLine();
        System.out.println("Your string is, " + str + "!");
        
        System.out.print("Enter an integer number: ");
        int num = scanner.nextInt();
        System.out.println("Number is " + num);

        System.out.print("Enter a floating number: ");
        float fnum = scanner.nextFloat();
        System.out.println("The floating num is " + fnum);
        
        scanner.close();
    }
}
