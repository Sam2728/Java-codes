public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int c=0,d=0,t=0;
        for(int i=0;i<str.length();i++)
        {
            if(c>0)
                d++;
            c=0;
            if(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z' )
            {
                for(int j=i;j<str.length();j++)
                {
                    if(str.charAt(j)==' ')
                    {
                        t++;
                        break;
                    }
                    else
                        c++;
                    i=j;
                }
            }
        }
        if(t>0)
            d+=1;
        System.out.print(d);
    }
}
