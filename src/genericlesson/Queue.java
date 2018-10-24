package genericlesson;

public class Queue<T>{
    private T[] data;
    private int head, tail;

    public Queue(T[] data) {
        head = 0;
        tail = 0;
        this.data = data;
    }

    public void enqueue(T i){
        data[++tail] = i;
    }

    public T dequeue(){
        return data[head++];
    }
}


//public class Queue {
//    private int[] data;
//    private int head, tail;
//
//    public Queue(){
//        head = 0;
//        tail = 0;
//        data = new int[100];
//    }
//    public void enqueue(int i){
//        data[++tail] = i;
//    }
//
//    public int dequeue(){
//        return data[head++];
//    }
//
//}