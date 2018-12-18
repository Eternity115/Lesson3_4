import TerminalIO.*;
public class EmployeePay {

    
    public static void main(String[] args) {
        KeyboardReader k = new KeyboardReader();
        double regpay =15, totregpay = 0, tototpay = 0,totpay = 0, otpay = 22.5, hours, totallemploy=0,regallemploy=0, overallemploy=0; //reuse for each employee in a for loop
        int employ=0;
        for (int i = 1; i <= 5; i++) {
            while (true){
                hours = k.readDouble("Enter the number of hours worked this week: ");
                if (hours>=1 && hours<=70) break;
                System.out.println("Invalid Number: Try Again");
            }
            if (hours>40){
                tototpay= (hours-40)*otpay;
                totregpay = regpay*40;
            }
            else {
                totregpay= hours*regpay;
                tototpay=0;
            }
            totpay=totregpay+tototpay;
            employ+=1;
            System.out.println("Employee " + employ);
            System.out.format("Grand Total: $%.2f\n",totpay);
            System.out.format("Regular Hour Total: $%.2f\n",totregpay);
            System.out.format("Overtime Hour Total: $%.2f\n",tototpay);
            System.out.println("===============================================");
            totallemploy+=totpay;
            regallemploy+=totregpay;
            overallemploy+=tototpay;
        }
        System.out.format("The Total Regular Pay for all employees is: $%.2f\n",regallemploy);
        System.out.format("The Total Overtime Pay for all employees is: $%.2f\n",overallemploy);
        System.out.format("The Total Pay for all employees is: $%.2f\n",totallemploy);

    
    }
}
