import java.util.Scanner;

public class Carrysum {
    public static void main(String[] args) {
        //235  349 count number of carry 
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int carry=0;
        int count=0;
        int num2=sc.nextInt();
        
        while(num1 !=0 || num2 !=0)
        {   int dig1=0;
            int dig2=0;
            if(num1!=0){
                dig1=num1%10;
            num1=num1/10;
            }
            if(num2!=0){
                dig2=num2%10;
                num2=num2/10;
            }
            System.out.println(count);
            carry=(dig1+dig2+carry)/10;
            
            if(carry==1)count++;
        }
        
        sc.close();
    }
}
