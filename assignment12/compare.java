import java.util.*;
class compare 
{
	public static void main(String[] args) 
	{
        HashSet<String> myset1 = new HashSet<String>();
        myset1.add("shivam");
        myset1.add("ram");
        myset1.add("sharry");
        myset1.add("rahul");
        System.out.println("First HashSet:"+myset1);
        HashSet<String>myset2 = new HashSet<String>();
        myset2.add("shivam");
        myset2.add("bilaspur");
        myset2.add("shivay");
        myset2.add("rahul");
        System.out.println("Second HashSet:"+myset2);
        for(String str:myset1)
        {
            if(myset2.contains(str))
            {
              System.out.print(str+" ");
            }
        }
		 
	}
}