import java.util.Scanner;
public class Decimal2Binary {
        public static void main(String[]args) {

        try{
        //s size= 25 
        Dec2Bin s = new Dec2Bin(25);

        
        int decimal = 0;
        
        Scanner scanInput = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        decimal = scanInput.nextInt();

        boolean stop = false;
         
        //repeat until stop is true

        while(!stop){
            //push the remainderof decnumber into stack
            if(!s.isfull()){
                s.push(decimal % 2);
                decimal /= 2;

                if(decimal == 0 || decimal ==1){
                    if(!s.isfull()){
                        s.push(decimal);
                        stop = true;
                    }
                }
            }
        }

        //now stack s contains binary value of decimal number
        System.out.print("Binary value is: ");

        //repeat until stack is empty to pop out binary digits
        while(!s.isempty()){
            System.out.print(s.pop());
        }
    }catch(Exception e){
        System.out.println("Error: Input cannot be a non integer" );
    }

}
}