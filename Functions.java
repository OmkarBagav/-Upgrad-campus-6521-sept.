import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {       // Scanner sc=new Scanner(System.in);
        //System.out.println("Enter Radius of circle");
        //float rad= sc.nextFloat();
        //System.out.println("The area of circle is "+circlearea(rad));


    Scanner sc=new Scanner(System.in);
        System.out.println("Enter no 1");
        int n1= sc.nextInt();
        System.out.println("Enter no 2");
        int n2= sc.nextInt();
        System.out.println("Enter no 3");
        int n3= sc.nextInt();
     max(n1,n2,n3);
}





    //public static float  circlearea (float r) {
   // return (float)(22/7)*r*r;

    public static void max(int n1,int n2,int n3){
        if (n1> n2 ){
            if (n1> n3){
                System.out.println(n1);            }
        } else if (n2>n1) {
            if (n2 > n3) {
                System.out.println(n2);            }
        }
        else{
            System.out.println(n3);        }

    }



}
