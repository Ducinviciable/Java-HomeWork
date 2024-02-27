// package discount.machine;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
// Tạo khách hàng
        Customer customer1 = new Customer("Alice", true, MemberType.Premium);
//        Customer customer2 = new Customer("Bob");
//        Customer customer3 = new Customer("Charlie");
//        Customer customer4 = new Customer("David");


        Visit visit1 = new Visit(customer1, new Date(2023, 11, 22), 100.0, 200.0);
//        Visit visit2 = new Visit("customer2",50);


        // Hiển thị tổng chi phí
        System.out.println("Tổng chi phí cho " + customer1.getName() + ": $" + visit1.getTotalExpense());
//        System.out.println("Tổng chi phí cho " + customer2.getName() + ": $" + visit2.getTotalExpense());
	}
}
