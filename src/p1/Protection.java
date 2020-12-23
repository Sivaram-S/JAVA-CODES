package p1;

public class Protection {
	
	int n = 1;
	private int n_pri = 2;
	protected int n_pro = 2;
	public int n_pub = 5;
	
	public Protection(){
		System.out.println("Basic constructor ");
		System.out.println(" N : " + n);
		System.out.println(" N_Pri : " + n_pri);
		System.out.println(" N_Pro : " + n_pro);
		System.out.println(" N_Pub : " + n_pub);
	}
	

}
