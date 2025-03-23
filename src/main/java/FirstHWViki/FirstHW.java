package FirstHWViki;

import java.util.Scanner;

public class FirstHW {
    public static void main (String [] args){
         System.out.println("Please enter your name");
         Scanner scanner = new Scanner(System.in);
         String userName = scanner.nextLine();

        System.out.println("Please enter your age");

        int useAge = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter your hobby");
        String userHobby = scanner.nextLine();

        System.out.println("Hi," + userName + ", you are"  +  useAge  +  "years old" + System.lineSeparator() + userHobby +  "is really nice hobby");
        scanner.close();



    }
}
