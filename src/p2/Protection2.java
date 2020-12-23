package p2;

class Protection2 extends p1.Protection {
	
	Protection2()
	{
		System.out.println("Derieved other package constructor");
		System.out.println(n_pub);
		System.out.println(n_pro);
	}

}
