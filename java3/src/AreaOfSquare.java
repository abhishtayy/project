import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args){
        System.out.println("area of square");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the height of square ");
        int h = sc.nextInt();
        System.out.println("enter the lent of square ");
        int l =sc.nextInt();
        int area = h*l;
        System.out.println("the are of square is "+ area+"sq" );
    }
}
