public class InsertionSort{


    public static void sort(Comparable[] arr){
            for(int i=1;i<arr.length;i++){
                Comparable current=arr[i];
                int previous=i-1;
                while(previous>=0 && current.compareTo(arr[previous])<0){
                        arr[previous+1]=arr[previous];
                        previous=previous-1;
                }
                arr[previous+1]=current;
                
                
                

            }
    }
    
}
