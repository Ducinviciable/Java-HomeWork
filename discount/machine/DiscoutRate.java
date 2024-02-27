
//package discount.machine;
//import ex.MemberType;
public class DiscoutRate {
	private final double serviceDiscountPremium = 0.2;
	private final double serviceDiscountGold = 0.15;
	private final double serviceDiscountSilver = 0.10;
	private final double productDiscountPremium = 0.1;
	private final double productDiscountGold = 0.1;
	private final double productDiscountSilver = 0.1;
	
	public double getServiceDiscountRate(MemberType rank) {
		if(rank == MemberType.Premium) {
			return serviceDiscountPremium;
		}
		
		if(rank == MemberType.Gold) {
			return serviceDiscountGold;
		}
		
		if(rank == MemberType.Silver) {
			return serviceDiscountSilver;
		}
		
		return 0;
	} 
	
	public double getProductDiscountRate(MemberType rank) {
		if(rank == MemberType.Premium) {
			return productDiscountPremium;
		}
		
		if(rank == MemberType.Gold) {
			return productDiscountGold;
		}
		
		if(rank == MemberType.Silver) {
			return productDiscountSilver;
		}
		
		return 0;
	}	
}
	
	
	
