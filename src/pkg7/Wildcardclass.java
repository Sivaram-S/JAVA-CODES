package pkg7;

class Onedim 
{
	int x ,y;
	
	Onedim(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

class Twodim extends Onedim
{
	int z;
	
	Twodim(int x, int y, int z)
	{
		super(x,y);
		this.z = z;
	}
}

class Threedim extends Twodim
{
	int d;
	
	Threedim(int x, int y, int z, int d)
	{
		super(x,y,z);
		this.d = d;
	}
}

class Coord<T extends Onedim>
{
	T[] coords;
	
	Coord(T[] obj)
	{
		coords = obj;
	}
}


public class Wildcardclass {
	
	static void showxy(Coord<?> objc)
	{
		for(int i=0;i<objc.coords.length;i++)
		{
			System.out.println("X ------------- Y ");
			System.out.println("X : " + objc.coords[i].x + " Y : " + objc.coords[i].y);
			System.out.println("------------------");
		}
	}
	
	static void showxyz(Coord<? extends Threedim> objc)
	{
		for(int i=0;i<objc.coords.length;i++)
		{
			System.out.println("X : " + objc.coords[i].x + " Y : " + objc.coords[i].y);
			System.out.println("Z : " + objc.coords[i].z + " D : " + objc.coords[i].d);
		}
	}
	
	public static void main(String args[])
	{
		Threedim item_list[] = { new Threedim(4,5,6,8), new Threedim(7,89,5,6) , new Threedim(4,5,63,3)};
		
		Coord<Threedim> obje = new Coord<Threedim>(item_list);
		
		showxy(obje);
		
		showxyz(obje);
	}
	
	
	
	

}
