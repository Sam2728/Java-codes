import java.util.*;
class sam
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.print(check(arr,n,target));
    }
    public static int check(int[] arr,int n,int t)
    {
        for(int i=0,j=n-1;i<=n&&j>=0;i++,j--)
        {
            if(arr[i]==t)
            {
                return 1;
            }
            if(arr[j]==t)
            {
                return 1;
            }
        }
        return 0;
    }
}
        
