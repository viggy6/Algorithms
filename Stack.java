public class Stack<T> {
    public int N;
    public T[] arr;

    
    public Stack(){
        this.arr=(T[])new Object[2]; 
    }

    public void push(T data){
        if(this.N==this.arr.length) this.resize(2*N);
        this.arr[N]=data;
        N++;
    }

    public T pop(){
        T val =this.arr[N-1];
        this.arr[--N]=null;
        if(N>0 && N==arr.length/4) this.resize(arr.length/2);
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

    private void resize(int size){
        T[] temp =(T[]) new Object[size];
        for(int i=0;i<N;i++){
            temp[i]=arr[i];
        }
        arr=temp;
    }
    private Boolean isFull(){
        return this.N==this.arr.length;
    }
}
