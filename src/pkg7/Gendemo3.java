package pkg7;

class Gen3<T extends Number>
{
	T[] nums;
	
	Gen3(T[] obj)
	{
		nums = obj;
	}
	
	double average()
	{
		double sum = 0.0;
		for(int i=0;i<nums.length;i++)
		{
			sum += nums[i].doubleValue();
		}
		
		return sum/nums.length;
	}
	
}

public class Gendemo3 {
	
	public static void main(String args[])
	{
		Integer items[] = {4,2,3,4};
		Gen3<Integer> intobj = new Gen3<Integer>(items);
		
		double avg = intobj.average();
		
		System.out.println("Average value  : " + avg);
		
		Double d_items[] = {4.0,2.0,3.0};
		
		Gen3<Double> doubleobj = new Gen3<Double>(d_items);
		
		double avg1 = doubleobj.average();
		
		System.out.println("Average Value  : " + avg1);
		
		
		
		
	}

}
