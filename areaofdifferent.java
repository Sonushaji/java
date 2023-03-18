class areaofdifferent
{
    double a,b,c;
    int l,w;
    void findArea(int c)//circle 
    {
        double ar=3.14*c*c;
        System.out.println("area of circle is " +ar);
    }
    void findArea(double a,double b)
    {
        double ar=(a*b)/2;
        System.out.println("ARAE OF TRIANGLE IS " +ar);
    }
    void  findArea(int l,int w)
    {
        double ar=(l*w);
        System.out.println("area of rectangle " +ar);
    }
    void findArea(double a,double b,double c)
    {
        double ar=((a+b)*c)/2;
        System.out.println("area of trapezium " +ar);
    }
}
class area
{
    public static void main (String args[])
    {
        areaofdifferent a1= new areaofdifferent();
        a1.findArea(3);
        a1.findArea(4,5,6);
        a1.findArea(3,5);
        a1.findArea(10,30);
    }
}