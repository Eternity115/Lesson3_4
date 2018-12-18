import BreezySwing.*; //BreezySwing.Format; -> just imports format
public class SalaryTable {

    
    public static void main(String[] args) {
        int oldsal=40000, raise, newsal;
        System.out.print(Format.justify('l', "YEAR", 8)); 
        System.out.print(Format.justify('l', "OLD SALARY", 14)); 
        System.out.print(Format.justify('l', "RAISE", 9)); 
        System.out.println(Format.justify('l', " NEW SALARY", 14));
        for (int i = 1; i <= 10; i++) {
            System.out.print(Format.justify('l', i, 8));
            System.out.print(Format.justify('l', "$" +String.valueOf(oldsal), 14));
            raise=(int)(oldsal*0.03);
            System.out.print(Format.justify('l',"$" +String.valueOf(raise), 9));
            newsal=oldsal+raise;
            System.out.println(Format.justify('l',"$" +String.valueOf(newsal), 14));
            oldsal=newsal;
        }
        
    }
    
}
