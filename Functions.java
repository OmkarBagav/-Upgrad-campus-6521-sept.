import java.util.Scanner;

public class Functions {
    /*Q1- Find area of circle using your function
    public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);
    System.out.println("Enter Radius of circle");
    float rad= sc.nextFloat();
    System.out.println("The area of circle is "+circlearea(rad));

}
    public static float  circlearea (float r) {
     return (float)(22/7)*r*r;
}


     */

    /*Q2- Find max of 3 nos using a functions

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no 1");
            int n1 = sc.nextInt();
            System.out.println("Enter no 2");
            int n2 = sc.nextInt();
            System.out.println("Enter no 3");
            int n3 = sc.nextInt();

            String result = max(n1, n2, n3);
            System.out.println(result);
        }

        public static String max(int num1, int num2, int num3) {
            int max;
            if (num1 >= num2 && num1 >= num3) {
                max = num1;
            } else if (num2 >= num1 && num2 >= num3) {
                max = num2;
            } else {
                max = num3;
            }

            String message = "The maximum of " + num1 + ", " + num2 + ", and " + num3 + " is: " + max;
            return message;
        }
    }


     */




    /* Q3- Find max of 3 nos using a functions
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

    int total = Sum(n1, n2);

        System.out.println("Sum is: " + total);
}

    public static int Sum(int number1, int number2)
    {
        return number1 + number2;
    }

     */

    /*Q4 write a fxn to check even or odd number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n1 = sc.nextInt();
        if (isEven(n1)) {
            System.out.println(n1 + " is even.");
        } else {
            System.out.println(n1 + " is odd.");
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }


     */

}


