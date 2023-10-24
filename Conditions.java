import java.util.Scanner;
public class Conditions {
    public static void main(String[] args) {

        /*q1 - get details about your age and tell what you should de doing
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (0<age && age<5) {
            System.out.println("You are a child");
        }
        if ( (age==5 || 5<age) && age <16) {
            System.out.println("You are studying till 10th");
        }
        if ( (age==16 || 16<age) && age <24) {
            System.out.println("You are studying till graduation");
        }
        if ( (age==24 || 24<age) && age <60) {
            System.out.println("Work,Get married and have a family");
        }
        if ( (age==60 || 60<age) && age <80) {
            System.out.println("Enjoy retirement");
        }

         */


        /* q2- Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.
        System.out.println("Enter a day from 1 to 7");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        if (day==1){
            System.out.println("Monday");
        }
        else if (day==2){
                System.out.println("Tuesday");
        }
        else if (day==3){
            System.out.println("Wednesday");
        }
        else if (day==4){
            System.out.println("Thursday");
        }
        else if (day==5){
            System.out.println("Friday");
        }
        else if (day==6){
            System.out.println("Saturday");
        }
        else if (day==7){
            System.out.println("Sunday");
        }
         */

        /*q3- Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        if (num == 0) {
            System.out.println("Zero");
        } else {
            if (num > 1.0) {
                System.out.println("Positive");
            }
            else {
                if ((-1 * num) > 1000000.0) {
                    System.out.println("large");
                } else if ((-1 * num) < 1.0) {
                    System.out.println("Small");
                } else if (num < -1.0) {
                    System.out.println("negative");
                }
            }
        }

         */

        /*q4 - Take length and breadth of a rectangle  from user and see if it is a square or not
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length of rectangle in cm: ");
        float length=sc.nextFloat();
        System.out.println("Enter breadth of rectangle in cm: ");
        float breadth=sc.nextFloat();
        if (length == breadth){
            System.out.println("I think it is a square");
            float area = length*breadth;
            System.out.println("The Area of Square is " +area + " cm^2");
        }
        else {
            System.out.println("It is a rectangle");
            float area = length*breadth;
            System.out.println("The Area of Square is " +area + " cm^2");

        }

         */

        /*q5 - A student will not be allowed to sit in exam if his/her attendance is less than 75%.
        Take following input from user , Number of classes held , Number of classes attended
        And print percentage of class attended . Is student is allowed to sit in exam or not.
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter total number of classes held");
        int clh=sc.nextInt();
        System.out.println("Enter number of classes attended");
        int cla=sc.nextInt();
        float attendance = (float) ((cla* 100)/clh);
        System.out.println(attendance);
        if (attendance > 75.0 && attendance<=100.0 ) {
            System.out.println("Your attendance is " + attendance + "%. Congrats!! You CAN attend the exam.");
        }
        else if (attendance <75.0 ) {
            System.out.println("Your attendance is " + attendance + "%. Sorry!! You CAN NOT attend the exam.");
        }
        else{
            System.out.println("Recheck & enter correct values");
        }
        
         */
    }

}
