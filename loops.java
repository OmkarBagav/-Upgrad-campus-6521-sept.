import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        /*q1-Print a table using any loop
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(num+ " X "+ i+ " = " + i*num);
        }

         */

        /* q2 - Repeat q1 using while loop
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int b= sc.nextInt();
        int i = 1;
        while (i <=10){
            System.out.println(b+ " X "+ i+ " = " + i*b);
            i++;
        }
         */

        /*q3 - Program to create a factorial
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int input = sc.nextInt();
        if (input == 0 || input == 1){
            System.out.println("1");
        }
        else{
            int fact = 1;
            for(int i=input;i>1;i--){
               fact = fact *i;
            }
            System.out.println(fact);
        }
         */

        /*q4 -vowel or consonant using switch case
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        switch (num1 % 2){
            case 0:
                System.out.println("Even");
            case 1:
                System.out.println("odd");
        }

         */






    }
}
