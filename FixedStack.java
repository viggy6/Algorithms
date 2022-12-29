
public class FixedStack<T>{
    public int N;
    public T[] arr;

    
    public FixedStack(int size){
        this.arr=(T[])new Object[size]; 
    }

    public void push(T data){
        this.arr[N]=data;
        N++;
    }

    public T pop(){
        T val =this.arr[N-1];
        this.arr[--N]=null;
        return val;
    }

    public String toString(){
        String output="[ ";
        for(T item:arr){
            output+=item+", ";
        }
        return output+" ]";
    }

    public Boolean isEmpty(){
        return this.N==0;
    }

    public Integer size(){
        return this.N;
    }

    public Boolean isFull(){
        return this.N==this.arr.length;
    }
}