public class Queue {
    int[] arr;
    int front;
    int rear;
    int capacity;
    int size;

    public Queue(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int item){
        if(size==capacity){
            System.out.println("Queue is full");
            return;
        }

        rear++;
        arr[rear] = item;
        size++;
    }

    public int dequeue () {
        if(size == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        int value = arr[front];
        front++;
        size--;
        return value;
    }

    public boolean isEmpty(){
            if(size==0) return true;
            else return false;
    }

    public void display(){
        if(size==0) {
            System.out.println("Queue is Empty");
        }else {
            for (int i=front; i<=rear; i++){
                System.out.print(arr[i]+ " ");
            }
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.display();
        q.enqueue(1);
        q.dequeue();
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(6);
        q.display();
        q.dequeue();
        q.display();
    }
}
