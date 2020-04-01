package be.intecbrussel.application;

import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.Magnum.MagnumType;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;

public class IceCreamAppV2 {

	public static void main(String[] args) {
		double ballPricse= 2.5;
		double rocketPrice = 1.7;
		double magnumStandardPrice= 2;
		
		PriceList priceList = new PriceList(2.5,1.7,2);
		
		IceCreamSeller iceCreamcar =new IceCreamCar(priceList);
		
		Eatable[] eatabls = new Eatable[3];
		Flavor[] flavors= {Flavor.BANANA,Flavor.CHOKOLATE,Flavor.LEMON,Flavor.MOKKA};
		eatabls [0] = iceCreamcar.ordederCone(flavors);
		eatabls [1] = iceCreamcar.orderIceRocket();
		MagnumType magnumType= MagnumType.ALPINENUTS;
		
		eatabls [2] = iceCreamcar.orderMagnum(magnumType);
		for (Eatable eatabel: eatabls ) {
			eatabel.eat();
		}
		System.out.println(iceCreamcar);
		
	}

}
