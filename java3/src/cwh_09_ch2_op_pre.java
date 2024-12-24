public class cwh_09_ch2_op_pre {
    public static void main(String[] args){

       //precedence & associativity
        int a = 6*5-34/2;
        System.out.println(a);
        //highest precedence goes to * and /. they are then evaluated on the basis of left to right associativity
       //=30-34/2
        //30-17
        //13

        int b =60/5-34*2;
        System.out.println(b);

        //12-34*2
        //12-68
        //-56



    }
}
