import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Tester {

    static Integer[] arr=new Integer[]{};

    public static void main(String[] args) {
        setInput(100000);
        perform();
    }

    public static void perform(){
     
        long start=System.currentTimeMillis();
        InsertionSort.sort(arr);
        System.out.println((System.currentTimeMillis()-start)/1000+" Seconds");
    }

    public static void setInput(int limit){
        Integer[] arr=new Integer[]{};
        List<Integer> inp=IntStream.rangeClosed(0, limit)
        .boxed()
        .parallel()
        .collect(Collectors.toList());
        Collections.shuffle(inp);
        arr=inp.toArray(arr);
        Tester.arr=arr;
    }
    
}
