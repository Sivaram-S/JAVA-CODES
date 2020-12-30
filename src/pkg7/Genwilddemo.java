package pkg7;

class Gen4<T extends Number>
{
	T[] nums;
	
	Gen4(T[] k)
	{
		nums = k;
	}
	
	double findAverage()
	{
		double sum = 0.0;
		
		for(int i=0;i<nums.length;i++)
		{
			sum += nums[i].doubleValue();
		}
		
		return sum/nums.length;
	}
	
	boolean sameAverage(Gen4<?> obj)
	{
		if(this.findAverage() == obj.findAverage())
			return true;
		
		return false;
	}
}

public class Genwilddemo {
	
	public static void main(String args[])
	{
		Integer items1[] = {1,2,3,4,5,6};
		Double items2[] = {1.0,2.0,3.0,4.0,5.0,6.0};
		
		Gen4<Integer> intobj = new Gen4<Integer>(items1);
		
		Gen4<Double> doubleobj = new Gen4<Double>(items2);
		
		
		
		if(intobj.sameAverage(doubleobj))
			System.out.println("Both have same Average.....");
		else
			System.out.println("Both have different Average......");
	}
	
}

