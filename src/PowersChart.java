import TerminalIO.*;
public class PowersChart {

    
    public static void main(String[] args) {
        KeyboardReader k = new KeyboardReader();
        int num=0;
        while (true){
            num = k.readInt("Enter a number from 1-10: ");
            if (num>0 && num<=10) break;
        }
        System.out.println("X       2^X");
        System.out.println("===     ======");
        for (int i = 0; i <= num; i++) {
            int pownum=(int) Math.pow(2, i);
            System.out.format("%d       2^%d=%d\n",i,i,pownum);
        }
        //ask for an int, 1-10, while loop
        //output a chart:
        /*
        x       2Powx
        ===     ======
        0 
        */
    }
    
}
