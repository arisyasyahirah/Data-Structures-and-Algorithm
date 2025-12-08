public class CharQueue {
    char q[];
    int front,rear,size;

    //constructor of class CharQueue
    public CharQueue(int m){
        size = m;
        q = new char[size];
        front = rear = -1;
    }

    void enqueue(char n){
        if(isFull()){
            System.out.println("Queue is full");

        }else{
            if (front == - 1) {
                front = rear = 0;
            }else{
                rear++;
            }
            q[rear] = n;
        }
    }

    //removes the element from thre front of th wue
    char dequeue(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return (char)250;
        }else{
            char x= q[front];
            front++;
            return x;
        }
    }

    //to see whats there
    char peek(){
        return q[front];

    }

    boolean isEmpty(){
        return (front == -1 || front > rear);
    }

    boolean isFull(){
        return(rear == size -1);
    }

        //  Print queue elements nicely
    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = front; i <= rear; i++) {
            sb.append(q[i]);
            if (i < rear) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}