public class LinearSearch {

    public static int search(Object target,Object[] arr){
        for(int i=0;i<arr.length;i++){
            if(target.equals(arr[i])) return i;
        }
        return -1;
    }
    
}
