import java.util.Locale;
import java.util.Scanner;

public class cwh_14_string_methods {
    public static void main(String[] args){
        String name ="Abhishta mp";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);
        // to upper case to lower case;
        String lstring = name.toLowerCase(Locale.ROOT);
        System.out.println(lstring);
        //to lower case to upper case;
        String ustring = name. toUpperCase(Locale.ROOT);
        System.out.println(ustring);

        String nontrimmedstring = "abhishta mp";
        System.out.println(nontrimmedstring);
        String trimmedstring= nontrimmedstring.trim();
        System.out.println(trimmedstring);
        // name substring(int start) removing character
        System.out.println(name.substring(1));
        // name substring(int start int end) removing character
        System.out.println(name.substring(1,2));
        // name replace("char","char") replace character
        System.out.println(name.replace("A","I"));
        System.out.println(name.replace("bhi","t"));
        //starting is true are false
        System.out.println(name.startsWith("Abhi"));
        //ending is true are false
        System.out.println(name.endsWith("shta mp"));
        //what is the character at given number
        System.out.println(name.charAt(3));
        //what is the given number at given character finding any object
        System.out.println(name.indexOf("s"));
        //name last index of
        System.out.println(name.lastIndexOf("shta mp"));
        System.out.println(name.lastIndexOf("hta mp",5));
        // name = name
        System.out.println(name.equals("Abhishta mp"));
        // equal ignore case upper case or lower case ignore
        System.out.println(name.equalsIgnoreCase("abhishta mp"));
        String text = "hello evere one";
        text=text.replace(" ", "_");
        System.out.println(text);

    }

}