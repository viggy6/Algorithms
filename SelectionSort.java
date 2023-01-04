public class SelectionSort {

    public static void sort(Comparable[] arr){

        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min].compareTo(arr[j])>0){
                    min=j;
                }
            }
            Comparable temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }

    }
    
}
