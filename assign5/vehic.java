abstract class Vehicle
{abstract void start();
abstract void stop();}

class twowheeler
{
void start()
{System.out.println("two wheeler will start");}
void stop()
{System.out.println("two wheeler will stop");}
}
class fourwheeler
{
void start()
{System.out.println("four wheeler will start");}
void stop()
{System.out.println("four wheeler will stop");}
}
public class vehic{
public static void main(String args[])
{
twowheeler a=new twowheeler();
fourwheeler b=new fourwheeler();
a.start();
a.stop();
b.start();
b.stop();
}
}