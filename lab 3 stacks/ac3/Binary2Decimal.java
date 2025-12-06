import java.util.Scanner;
public class Binary2Decimal {
        public static void main(String[]args) {

        try{
        //s size= 25 
        Bin2Dec s = new Bin2Dec(25);

        
        // int binary = 0;
        // int id =0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryStr = input.next();
        
        //validate binary input
            if (!binaryStr.matches("[01]+")) {
                System.out.println("Error: Input must contain only 0s and 1s");
                return;
            }
         

            // Convert binary string to decimal using stack
            int decimalValue = 0;
            int power = 0;

            for(int i = binaryStr.length() - 1; i >= 0; i--){
                char digit = binaryStr.charAt(i);
                if(!s.isfull()){
                    s.push(Character.getNumericValue(digit));
                }
            }
        
            //calculate decimal value by popping stcak
            while (!s.isempty()){
                int digit = s.pop();
                decimalValue = decimalValue * 2 + digit;
            }

        //now stack s contains binary value of decimal number
        System.out.print("Decimal value is: " + decimalValue);

    }catch(Exception e){
        System.out.println("Error: Invalid input - " );
    }

}
}