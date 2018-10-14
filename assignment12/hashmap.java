import java.util.*;
class HashMapDemo
{
	public static void main(String args[])
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("first name","shivam");
		hm.put("Last name","rajan");
		hm.put("address","bilaspur");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+":"+m.getValue());  
		}
	}
}