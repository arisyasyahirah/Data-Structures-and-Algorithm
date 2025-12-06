import java.io.IOException;
public class ChrStackTest extends IOException{
    public static void main(String[]args) throws IOException {
        //100 chars
        ChrStack s = new ChrStack(100);

        //character to store innput
        char ch;

        //give instruction to user
        System.out.println("Please enter your name:");



        //get and store into stck using push method until user presses enter
        while((ch = (char) System.in.read()) != '\n'){
            if(!s.isfull()){ //check stack is not full
                s.push(ch); //put data in stack
            }
        }
        System.out.println("Your name in reverse order is: ");
        while(!s.isempty()){
            System.out.print(s.pop());
        }

    }
    
}
