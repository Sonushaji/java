class rectangle
{
    int l,w;
    void findArea(int l,int w)
    {
        int ar=l*w;
        System.out.println("area of rectangle " +ar);
    }
    void findperimeter(double l,double w)
    {
        double pr=2*(l+w);
        System.out.println("perimeter of rectangle is "+pr);
    }
}
class size
{
    public static void main(String args[])
    {
        rectangle a1=new rectangle ();
        a1.findArea(23,25);
        a1.findperimeter(24,34);
    }
} 
