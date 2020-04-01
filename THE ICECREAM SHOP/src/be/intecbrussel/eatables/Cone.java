package be.intecbrussel.eatables;

public class Cone implements Eatable {

	public final Flavor[]balls;
		
	
	
	public Cone () {
		this.balls = null;
	
	}
	public Cone (Flavor[] balls) {
		this.balls=balls;
		
	}
	@Override
	public void eat() {
		for (Flavor x:this.balls  )
		System.out.println("Order is  :" + x);
		
	}
	public enum Flavor  {
		STRAWBERRY,
		BANANA,
		CHOKOLATE,
		VANILLIA,
		LEMON,
		STRACIATELLA,
		MOKKA,
		PISTACHE;	
	}
}
