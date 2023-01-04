import java.util.Arrays;

public class Tester {

    public static void main(String[] args) {
       Integer[] arr= new Integer[]{2,3,1,5,4,6,7,8,9,0};
       SelectionSort.sort(arr);
       System.out.println(Arrays.asList(arr));
    }
    
}
