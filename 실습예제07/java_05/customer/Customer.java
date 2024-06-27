package java_05.customer;

public class Customer {

	//	customerId		- 고객 ID
	//	customerName	- 고객 이름
	//	customerGrade	- 고객 등급
	//	bonusPoint		- 고객의 보너스 포인트
	//					- 고객이 제품을 구매할 경우 누적되는 포인트
	//	bonusRatio		- 보너스 포인트 적립 비율
	//					- 고객이 제품을 구매할 때 구매 금액의 일정 비율이 포인트로 적립


	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerGrade = "SILVER";
        bonusRatio = 0.01;
    }
    
    
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        
        return price;
    }

    public String showCustomerInfo() {
    	String result = customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    	
        return result;
    }


	
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	public int getBonusPoint() {
		return bonusPoint;
	}
	
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	public double getBonusRatio() {
		return bonusRatio;
	}
	
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

}