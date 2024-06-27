package java_05.customer;

public class VIPCustomer extends Customer {
	
	// VIP 고객 전용 혜택 관리를 위한 필드 추가
	
	// agentID		- 전문 상담원
	// saleRatio	- 제품 구매 할인율 : 10%
	// bonusRatio 	- 0.05 (5%)
	
    private int agentID;
    private double saleRatio;

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }
    
    public int calcPrice(int price) {
    	// VIP 전용 보너스 포인트 적립
        bonusPoint += price * bonusRatio;
        
        // VIP 전용 할인율 적용
        price = (int) (price * saleRatio);
        
        return 0;
    }

    public int getAgentID() {
        return this.agentID;
    }

}
