package genericlesson;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new Queue<>(new Integer[20]);
        integerQueue.enqueue(9);
        integerQueue.enqueue(10);

        System.out.println(integerQueue.dequeue());

        Queue<String> stringQueue = new Queue<>(new String[20]);
        stringQueue.enqueue("hello world");
        stringQueue.enqueue("hello java");
    }
}
