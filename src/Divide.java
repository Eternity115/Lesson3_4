import TerminalIO.*;
public class Divide {

    
    public static void main(String[] args) {
        KeyboardReader k = new KeyboardReader();
        int num1,num2,q=0,r=0;
        num1 = k.readInt("Enter an Integer: ");
        num2 = k.readInt("Enter another Integer: ");
        int bigger,smaller;
        if (Math.max(Math.abs(num1), Math.abs(num2))==Math.abs(num1)){
            bigger=num1;
            smaller=num2;
            q=num1/num2;
            r=num1%num2;
        }
        else{
            bigger=num2;
            smaller=num1;
            q=num2/num1;
            r=num2%num1;
        }
        System.out.format("%d \u00F7 %d = %dr %d\n",bigger,smaller,q,r);
    }
    
}
