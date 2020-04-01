package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum.MagnumType;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.IcecreamSalon;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {

	public static void main(String[] args) {
		
	
	double ballPricse= 2;
	double rocketPrice = 1;
	double magnumStandardPrice= 1.5;
	PriceList priceList = new PriceList(2,1,1.5);
	IceCreamSeller iceCreamSalon =new IcecreamSalon(priceList);
	
	Eatable[] eatabls = new Eatable[4];
	Flavor[] flavors= {Flavor.BANANA,Flavor.CHOKOLATE,Flavor.LEMON,Flavor.MOKKA};
	eatabls [0] = iceCreamSalon.ordederCone(flavors);
	eatabls [1] = iceCreamSalon.orderIceRocket();
	MagnumType magnumType= MagnumType.ALPINENUTS;
	eatabls [2] = iceCreamSalon.orderMagnum(magnumType);
	eatabls [3] = iceCreamSalon.orderMagnum(magnumType);

	
	for (Eatable eatabel: eatabls ) {
		eatabel.eat();
	}
	System.out.println(iceCreamSalon);
	
	}
}