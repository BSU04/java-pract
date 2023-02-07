class Test
{ 
static int i;
int j;
void values(int a,int b)
{
this.i=a;
this.j=b;
}
void add()
{
System.out.println(i+j);
}

void mul()
{
System.out.println(i*j);
}
public static void main(String[] args)
{
Test t=new Test();
t.values(100,200);
t.add();
t.mul();
}
}
