import java.awt.*;
import java.util.Scanner;

public class practes_set {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element");
        int b= sc.nextInt();
        a[0] = 0;
        a[1] = 4;
        a[2] = 6;
        a[3] = 3;
        a[4] = 5;
        boolean isInArray = false;
        for (int element:a) {
            if(b==element){
                isInArray = true;
            break;


        }

            }
        if(isInArray) {
            System.out.println("the element is present");

        }
        else {
            System.out.println("the element not present");
        }




        }
    }

