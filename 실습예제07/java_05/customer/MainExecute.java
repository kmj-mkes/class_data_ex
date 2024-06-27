package java_05.customer;

public class MainExecute {

	public static void main(String[] args) {
		// 일반 고객
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10100);
		customerLee.setCustomerName("Lee");

		// VIP 고객
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10101);
		customerKim.setCustomerName("Kim");
		
		// VIP 고객 - 상위 클래스로의 묵시적 형 변환(업캐스팅)
		Customer customerPark = new VIPCustomer();
		customerPark.setCustomerID(10101);
		customerPark.setCustomerName("Park");
		
		// Customer(1%) , VIP(5%)
		customerPark.calcPrice(10000);

		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
		System.out.println(customerPark.showCustomerInfo());

	}

}