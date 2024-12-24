import java.util.Scanner;
import java.util.ArrayList;
public class input_string {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Scanner scanObj = new Scanner(System.in);
                ArrayList<String> names = new ArrayList<>();

                System.out.println("Enter 10 names:");
                for (int i = 0; i < 5; i++) {
                    System.out.print("Enter name " + (i + 1) + ": ");
                    names.add(scanner.nextLine());
                }

                System.out.println("\nThe names you entered are:");
                for (String name : names) {
                    System.out.println(name);
                }
        System.out.println("enter the name to search");
               String name=scanObj.next();
        boolean isInArray = false;
        for (String element:names) {
        if(element == name){
            isInArray = true;
            break;


            }
        }
        if(isInArray) {
            System.out.println("the element is not present");

        }
        else {
            System.out.println("the element is present");
        }}}


