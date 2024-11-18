class Gietthread{
public static void main(String args[])
{
Thread t = Thread.currentThread();
System.out.println("Thread is "+t);
t.setName("My Thread");
System.out.println("After change:"+t);

try{
for(int i = 0; i<5;i --)
{
System.out.println(i);
Thread sleep(1000);
}
}
catch(IntegerException e)
{
System.out.println(e);
}
}

} 