public class BinarySearch {

    public static int search(Object target,Object[] arr){
        int low=0;
        int high=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            
            if(target.equals(arr[mid])) return mid;
            else if(((Comparable) target).compareTo(arr[mid])>0) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
    
}
