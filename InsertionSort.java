public class InsertionSort{


    public static void sort(Object[] arr){
            for(int i=1;i<arr.length;i++){
                Object current=arr[i];
                Comparable val=(Comparable) current;
                int previous=i-1;
                while(previous>=0 && val.compareTo(arr[previous])<0){
                        arr[previous+1]=arr[previous];
                        previous=previous-1;
                }
                arr[previous+1]=current;
                
                
                

            }
    }
    
}
