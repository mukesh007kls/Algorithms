import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        String[] array={"Mukesh","Akhi","Rahul","Venkat","Manoj"};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        String str="Akhi";
        BinarySearch br=new BinarySearch();
        int result=br.binarySearch(array,str);
        if(result==-1)
            System.out.println("Elements not present");
        else System.out.println("Elements found at "+"index "+result);
    }

    private int binarySearch(String[] array, String str) {
        int l=0;
        int r=array.length-1;
        while (l<=r){
            int m=l+(r-1)/2;
            int res=str.compareTo(array[m]);
            if (res==0)
                return m;
            if (res>0)
                l=m+1;
            else
                r=m-1;
        }
        return -1;
    }

}