// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        int cons=1;
        while(n>0)
        {
            int temp=n%10;
            if(temp==0)
                res+=5*cons;
            else
                res+=temp*cons;
            n/=10;
            cons*=10;
        }
        System.out.print(res);
    }
}
