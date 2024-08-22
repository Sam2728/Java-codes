// "static void main" must be defined in a public class.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            if(palli(i))
                System.out.printf("%d ",i);
        }
    }
    public static Boolean palli(int n)
    {
        String str=String.valueOf(n);
        int i=str.length()-1;
        int m=0;
        while(i>m)
        {
            if(str.charAt(m)!=str.charAt(i))
                return false;
            
            
            m++;
            i--;
        }
        return true;
        

}
}
