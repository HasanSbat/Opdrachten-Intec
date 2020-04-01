package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;

public class IceCreamCar implements IceCreamSeller {

	PriceList priceList;
	Stock stock;
	double profit;
	
	public IceCreamCar (PriceList priceList,Stock stock ) {
		this.priceList=priceList;
		this.stock= stock;
	}
	
	public IceCreamCar(PriceList priceList) {
		this.priceList= priceList;
	}

	@Override
	public Cone ordederCone(Flavor[] flavors) {
		Cone cone  = new Cone(flavors);
		this.profit+=flavors.length*priceList.getBallPricse();
		return cone;
	}
	private Cone prepareCone(Flavor[] flavors) {
		return null;	
	}
	@Override
	public IceRocket orderIceRocket() {
		IceRocket iceRocket = new IceRocket();
		this.profit+=priceList.getRocketPrice();
		return iceRocket;
	}
	private IceRocket prepareIceRocket() {
		return null;
	}
	@Override
	public Magnum orderMagnum(MagnumType magnumType) {
		Magnum magnum1= new Magnum (magnumType);
		this.profit += priceList.getMagnumPrice(magnumType);
		return magnum1;
	}
	private Magnum prepareMagnum(MagnumType magnumType ) {
		return null;
	}
	
	@Override
	public double getProfit() {
		return 0;
	}
	
	
	
	
}
