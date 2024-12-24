import java.util.Scanner;

public class array_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i =0;

            System.out.println("enter the array size");
        int n = sc.nextInt();
        int []a =new int[n];
            for ( i=0;i<n;i++){
                System.out.println("enter the values");
                a[i]=sc.nextInt();

        }
        System.out.println("the array values are");
        for(i= 0;i<n;i++ ){
            System.out.print(a[i]);
            System.out.print(" ");

        }
    }



}