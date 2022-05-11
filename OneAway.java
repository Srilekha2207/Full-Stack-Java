
public class Solution {
    public static boolean isOneAway(String a, String b) {
        // Write your code here.
		if (a.length()==b.length())
			return replace(a, b);
		else if (a.length()+1==b.length())
			return insert(a, b);
		else if (a.length()==b.length()+1)
			return insert(b, a);
		return false;
    }
	
	public static boolean replace(String a, String b)
	{
		boolean diff=false;
		for(int i=0;i<a.length();i++)
		{
			if ((a.charAt(i))!=(b.charAt(i)))
			{
				if (diff)
					return false;
				diff=true;
			}
		}
		return true;
	}
	
	public static boolean insert(String a, String b)
	{
		int i1=0;
		int i2=0;
		while((i2<b.length()) && (i1<a.length()))
		{
			if (a.charAt(i1) != b.charAt(i2))
			{
				if (i1!=i2)
					return false;
				i2++;
			}
			else
			{
				i1++;
				i2++;
			}
		}
		return true;
	}
}
