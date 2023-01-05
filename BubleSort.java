import java.util.Arrays;

public class BubleSort{


    public static void sort(Comparable[] arr) {
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    Comparable temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
            
            
        }
        
    }
   
}
