class reversedtring
{
    public static void main(String args[])
    {
     String s="java program";
     String s2="";
     int n=s.length();
     int i;
     for(i=0;i<n;i++)
     {
         s2=s2+s.charAt(n-i-1);
     }
     System.out.println("\nthe reverse string is\n ");
     System.out.println(s2);
    }
}