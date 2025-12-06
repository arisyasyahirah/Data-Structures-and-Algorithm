public class ChrStack {

    //stack size
    private static final int defaultSize =10;

    //variabl;e
    private int size;//sizeof stack
    private int top;//index in top
    private char[] stack;//array holding int data

    //constructors
    ChrStack(){
        size = defaultSize;
        top = -1;
        stack = new char[defaultSize];
    }

    //to cxreate stack using supplied size
    ChrStack(int size){
        top = -1;
        this.size = size;
        stack = new char[size];
    }

    //push method to insert data to the top stack
    void push(char data){
        top++;//GO TO upper position
        stack[top] = data;//put data in the position
    }

    //pop, to remove top element/data in the public stack
    char pop(){
    char data = stack[top];// get data at the current
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
