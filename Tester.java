import java.util.Arrays;

public class Tester {

    public static void main(String[] args) {
       FixedStack<Integer> fs= new FixedStack<Integer>(5);
       fs.push(5);
       fs.push(24);
       fs.push(5);
       System.out.println(fs.pop());
       fs.push(36);
       System.out.println(fs);
       System.out.println(fs.size());
       fs.push(44);
        fs.push(66);
       System.out.println(fs);
       System.out.println(fs.isFull());
    }
    
}
