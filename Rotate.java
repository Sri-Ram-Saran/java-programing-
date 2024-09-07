import java.util.Scanner;
public class Rotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello bro can you just give me the length of the array");
        int n=sc.nextInt();

        int a[]=new int[n];
        System.out.println("bro can you just give elements of the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("tell the no of elements to be rotated anticlockwise form starting to ending");
        int d=sc.nextInt();
        if(d>n){
            d=d%n;
        }
        int temp[]=new int[d];
        System.arraycopy(a,0,temp,0,d);
        System.arraycopy(a, d, a, 0, n-d);
        System.arraycopy(temp,0,a,n-d,d);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
