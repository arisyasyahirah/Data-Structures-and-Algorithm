public class Dec2Bin {

    //stack size
    private static final int defaultSize =10;

    //variable
    private int size;//sizeof stack
    private int top;//index in top
    private int [] stack;//array holding int data

    //constructors
    Dec2Bin(){
        size = defaultSize;
        top = -1;
        stack = new int[defaultSize];
    }

    //to cxreate stack using supplied size
    Dec2Bin(int size){
        top = -1;
        this.size = size;
        stack = new int[size];
    }

    //push method to insert data to the top stack
    void push(int data){
        top++;//GO TO upper position
        stack[top] = data;//put data in the position
    }

    //pop, to remove top element/data in the public stack
    int pop(){
    int data = stack[top];// get data at the current
    top--;//position and to go down one step
    return data; //step and return data
    }

    //isEmpty used to check if the stack is empty, 
    //usually before pop to check

    boolean isempty(){
        return(top == -1);//if top is -1, stack is empty
    }

    //8.isfull, used to check if the stack is full
    //before it calls push,t or f
    boolean isfull(){
        return(top == size - 1);
    }

    // 9. lenght method, to get current top value
    int length(){
        return top;
    }
}
