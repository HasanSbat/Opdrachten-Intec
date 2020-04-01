package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum.MagnumType;

public class PriceList {

	public  double ballPricse = 0;
	public  double rocketPrice = 0;
	public  double magnumStandardPrice=3;
	
	public PriceList() {
	}
	public PriceList(double ballPricse, double rocketPrice,double magnumStandardPrice ) {
		this.ballPricse=ballPricse;
		this.rocketPrice= rocketPrice;
		this.magnumStandardPrice=magnumStandardPrice;
	}
	public double getBallPricse() {
		return ballPricse;
	}
	public void setBallPricse(double ballPricse) {
		this.ballPricse = ballPricse;
	}
	public double getRocketPrice() {
		return rocketPrice;
	}
	public void setRocketPrice(double rocketPrice) {
		this.rocketPrice = rocketPrice;
	}
	public void setMagnumStandardPrice(double magnumStandardPrice) {
		this.magnumStandardPrice = magnumStandardPrice;
	}
	
	public double getMagnumPrice(MagnumType m ) {
		double magnumPrice = magnumStandardPrice;
		
		switch(m) {
		case MILKCHOCOLATE : magnumPrice *= 1 ; break;
		case WHITECHOCOLATE : magnumPrice *= 1; break;
		case BLACKCHOCOLATE : magnumPrice *= 1.2; break;
		case ALPINENUTS : magnumPrice *= 1.5; break;
		case ROMANTICTRAWBERRIES : magnumPrice *= 1.6; break;
		}	
		System.out.println(magnumPrice);
		
		return magnumPrice;
		
		
		
	}
	
	
	
}
