public class array {
    public static void main(String[] args) {
        int[] a = new int[6];
        a[0]= 7;
        a[1]=6;
        a[2]=3;
        a[3]=4;
        a[4]=6;
        for (int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
       /* int [] arr = {1,2,3,4,5,6};
        int l =arr.length;
        int n =Math.floorDiv(l,2);
        int temp;*/

      /*  for (int i= 0;i<n;i++){
            temp=arr[i];
            arr[i]=arr[l-1-i];
            arr[l-1-i]=temp;
        }
        for (int element:arr){
            System.out.println(element+" ");
        }*/




        for ( int i= 0;i<5;i++) {
            System.out.println(a[i]);
        }
        }

    }
