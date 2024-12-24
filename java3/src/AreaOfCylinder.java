import java.util.Scanner;

public class AreaOfCylinder {
    public static void main(String[] args){
        // 2*pie*r*h+2*pie*r*r
        System.out.println("area of cylinder");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of cylinder");
        int r = sc.nextInt();
        System.out.println("enter the height of the cylinder");
        int h = sc.nextInt();
        float pie = 3.14f;
        float area =(float) 2*pie*r*h+2*pie*r*r;
        System.out.println("area of cylinder is ");
        System.out.println(area);


    }
}
