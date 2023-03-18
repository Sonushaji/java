class complex
{
    float real;
    float img;
    complex()
    {
        real=23.4f;
        img=24.4f;
    }
    complex(float real,float img)
    {
        this.real=real;
        this.img=img;
    }
    complex sum(complex c)
    {
        complex c1=new complex(c.real,c.img);
        c1.real=c.real+real;
        c1.img=c.img+img;
        return c1;
    }
}
class sumcomp
{
    public static void main(String args[])
    {
        complex x=new complex();
        complex y=new complex(5.5f,7.4f);
        complex z;
        z=x.sum(y);
        System.out.println("THE SUM OF THE COMPLEX NUMBER IS :"+z.real+"+i"+z.img);
    }
}
