package Item;

public class Product {

	String proName;		//제품이름
	String calory;		//칼로리, 무게, 등 설명
	String foodInfo;	//제품 한줄설명
	int price;			//가격
	int count;			//수량
	
	public Product(String proName, String calory, String foodInfo) {
		this.proName=proName;
		this.calory=calory;
		this.foodInfo=foodInfo;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getCalory() {
		return calory;
	}

	public void setCalory(String calory) {
		this.calory = calory;
	}

	public String getFoodInfo() {
		return foodInfo;
	}

	public void setFoodInfo(String foodInfo) {
		this.foodInfo = foodInfo;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
	
}
