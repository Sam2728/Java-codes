import java.util.*;
class sam
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(checkpassword(s));
    }
    public static int checkpassword(String s)
    {
        if(s.length()<4 || s.charAt(0)>='0' && s.charAt(0)<='9')
        {
            return 0;
        }
        int c=0,d=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='A'&&ch<='Z')
            {
                c++;
            }
            if(ch>='0'&&ch<='9')
            {
                d++;
            }
            if(ch=='/'||ch==' ')
            {
                return 0;
            }
        }
        if(c==0&&d==0)
        {
            return 0;
        }
        return 1;
    }
}
