public class BubleSort{


    public static void sort(Object[] arr) {
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                Comparable current= (Comparable)arr[j];
                Comparable next=(Comparable)arr[j+1];
                if(current.compareTo(next)>0){
                    arr[j+1]=current;
                    arr[j]=next;
                }
            }
        }
        
    }
   
}
