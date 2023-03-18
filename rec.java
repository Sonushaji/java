class rec
{
 int length;
 int breadth;

 rec()//default constructor
 {
     //length=10;
     //breadth=20;
 }
 rec(int length,int breadth)//parametrized constructor 
 {
     //this.length=length;
     //this.breadth=breadth;

 }
 int getArea()
 {
     return length*breadth;
 }
 int getperimeter()
 {
     return 2+(length*breadth);
 }
int samearea()
{
    if(r.getArea==getArea())
    return 1;
    else
    return 0;
}
}
class size{
    public static void main (String args[])
    {
        rec r1=new rec(34,45);
        System.out.println("rectangle 1");
        r1.getArea();
        System.out.println("area of rectangle "+r1.getArea());
        r1.getperimeter();
        System.out.println("perimeter of a rectangle" +r1.getperimeter());
    }
}

