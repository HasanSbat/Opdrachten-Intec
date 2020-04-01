package be.intecbrussel.eatables;

public class Magnum implements Eatable  {
	public final MagnumType type;
	
	public Magnum() {
		this.type = null;
		
	}
	
	public Magnum( MagnumType type) {
		this.type = type;
	}
	
	@Override
	public void eat() {
		
		MagnumType magnum = MagnumType.ALPINENUTS;
		String m = null;
		switch(magnum) {
		case MILKCHOCOLATE : m ="MILKCHOCOLATE"; break;
		case WHITECHOCOLATE : m ="WHITECHOCOLATE"; break;
		case BLACKCHOCOLATE : m ="BLACKCHOCOLATE"; break;
		case ALPINENUTS : m ="ALPINENUTS"; break;
		case ROMANTICTRAWBERRIES : m ="ROMANTICTRAWBERRIES"; break;
		}
		System.out.println("Your ordr is : " + m);
	}
	
	public MagnumType getType() {
		return type;
	}
	
	public enum MagnumType{
		MILKCHOCOLATE,
		WHITECHOCOLATE,
		BLACKCHOCOLATE,
		ALPINENUTS,
		ROMANTICTRAWBERRIES;
	 
	}
}
