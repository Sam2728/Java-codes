class sam
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        int m=0,ind=0;
        for(int i=0;i<n;i++)
        {
            if(m<arr[i])
            {
                m=arr[i];
                ind=i;
            }
        }
        System.out.print(m+"-->"+ind);
    }
}
