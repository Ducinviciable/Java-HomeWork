//package discount.machine;

import java.util.Date;

public class Visit {
	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;

	public Visit(Customer customer, Date date, double serviceExpene, double productExpense) {
		super();
		this.customer = customer;
		this.date = date;
		this.serviceExpense = serviceExpense;
		this.productExpense = productExpense;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}

	// Hàm tính toán
	public double getTotalExpense() {
		DiscoutRate discoutRate = new DiscoutRate();
		return (serviceExpense - (serviceExpense * discoutRate.getServiceDiscountRate(customer.getMemberType())))
				+ (productExpense - (productExpense * discoutRate.getProductDiscountRate(customer.getMemberType())));
	}

}