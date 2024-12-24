public class array3 {
    public static void main(String[] args) {
        int []arr={7,2,3,4,5,6};
        int min =Integer.MAX_VALUE;
        for (int e:arr){
            if(e<min){

                min=e;
            }

        }
        System.out.println(min);
        }

    }

