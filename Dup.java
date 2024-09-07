import java.util.HashMap;
import java.util.Scanner;
public class Dup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Character,Integer> H=new HashMap<>();
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<s.length()){
            if(!H.containsKey(s.charAt(i))){
                H.put(s.charAt(i),1);
                sb.append(s.charAt(i));
            }i++;
            
        }
        String d=sb.toString();
        System.out.println(d);
        sc.close();
    }
}
