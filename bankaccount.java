class account
{
    String name;
    String address;
    String type;
    int acco;
    int amt;
    int bal;
    account()
    {
        name ="sonu";
        acco=114;
        amt=10000;
        bal=amt;
    }
    account(String name,String address,String type,int acco,int bal)
    {
        this.name=name;
        this.address=address;
        this.type=type;
        this.acco=acco;
        this.bal=bal;
    }
    void dispaly()
    {
        System.out.println("name="+name);
        System.out.println("address="+address);
        System.out.println("type="+type);
        System.out.println("acco="+acco);
        System.out.println("balance"+bal);
    }
    int deposit(int x)
    {
        bal=bal+x;
        return bal;
    }
    int withdraw(int y)
    {
        if(y>bal)
        {
            System.out.println("insufficent balance");
        }
        else
        {
            bal=bal-y;
            return bal;
        }
    }int getbalance()
    {
        return bal;
    }
}


