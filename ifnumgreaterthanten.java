import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number greater than 10: ");
        int num = scn.nextInt();
        
        if (num > 10){
            System.out.println("Your number is greater than 10!");
        } else if (num == 10) {
            System.out.println("Your number is 10");
        }else {
            System.out.println("Your number is smaller than 10");
        }
        
        
        scn.close();
    }
}
