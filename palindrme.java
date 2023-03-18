class palindrome
{
    public static void main (String args[])
    {
      String s="malayalam";
      String s1=s.toLowerCase();
      int n=s.length();
      int i;
      int flag=0;
      for(i=0;i<n/2;i++)
      {
          if(s1.charAt(i)!=s1.charAt(n-i-1))
        {
            flag=1;
            break;

        }
       
      }
     if(flag==1)
     {
         System.out.println(s+ "\nstring is not palindrome ");
     }
     else{
         System.out.println(s+ "\nstring is palindrome ");
     }
    }
}