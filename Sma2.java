import java.util.*;
public class Sma2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        //System.out.println(a[1]);
        int j=0;
        while (j<n) {
            if(a[j]==a[j+1]){
                j++;
            }
            else{
                break;
            }
        }
        System.out.println(a[j+1]);

    }
}
