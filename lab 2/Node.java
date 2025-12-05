public class  Node {
    //star of class node
    //two dofferet types: int and double 
    public int data1;
    public double data2;
    Node next;

    //constuructor for the node
    public Node(int d1, double d2){
        data1 = d1;
        data2 = d2;
        next = null;
    }

    //print node data
    public void printNode(){
        System.out.println("{"+ data1 +"," +data2 +"}");

    }
}
//end of class node
