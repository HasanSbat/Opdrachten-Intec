package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;

public class IcecreamSalon implements IceCreamSeller  {
	PriceList priceList;
	double totalProfit;
	
	public IcecreamSalon(PriceList priceList) {
		this.priceList= priceList;
	}

	@Override
	public double getProfit() {
		return this.totalProfit;
	}

	@Override
	public Cone ordederCone(Flavor[] flavors) {
		Cone cone  = new Cone(flavors);
		this.totalProfit+=flavors.length*priceList.getBallPricse();
		return cone;
	}

	@Override
	public IceRocket orderIceRocket() {
		IceRocket iceRocket = new IceRocket();
		this.totalProfit+=priceList.getRocketPrice();
		return iceRocket;
	}

	@Override
	public Magnum orderMagnum(MagnumType magnumType) {
		Magnum magnum1= new Magnum (magnumType);
		this.totalProfit += priceList.getMagnumPrice(magnumType);
		return magnum1;
	}
	public String toString() {
		return "Total profit is: " + this.totalProfit;
		
	}
	
}
