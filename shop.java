public class Good {
	string name;
	int price;
	int id;
	int size;
	int number;
	boolean isBroken;
	string producer;
	string dateOfProduce;
	boolean isPaid;

	public Good (string name, int price, int id, int size, int number, boolean isBroken,
	       string producer, string dateOfProduce, boolean isPaid){
		this.name = name;
		this.price = price;
		this.id = id;
		this.size = size;
		this.number = number;
		this.isBroken = isBroken;
		this.producer = producer;
		this.dateOfProduce = dateOfProduce;
		this.isPaid = isPaid;
	};
}


public class Employee {
	string name;
	boolean isMaster;
	int experience;
	int salary;

	public void getPaid(){
		System.out.printl("Paid is gotten.");
	};

	public void getSalary(int salary){
		if (salary != 0)
		System.out.printl("Salary " + salary+ " is paid.");
	}

	public Employee (string name, boolean isMaster, int experience, int salary){
		this.name = name;
		this.isMaster = isMaster;
		this.experience = experience;
		this.salary = salary;
	}


	public class Seller : Employee {

		public void findGood(Good good){

			System.out.printl("Good " + good + " is found.");
		}

		public void giveOutGood(Good good){
			if (good.isPaid = true) // запитати як прописати конкретний екземпляр, а не клас !!!!!!!!!!
			System.out.printl("Good is gotten.");
		}

		public Seller (string name, boolean isMaster, int experience, int salary){
			this.name = name;
			this.isMaster = isMaster;
			this.experience = experience;
			this.salary = salary;
		}


	public class Bookkeeper : Employee {

		public void findGood(функція покупця, чи оплачений товар такий-то, Good good){
			if (покупець оплатив)
				good.isPaid = true;
			System.out.printl("Good " + good + " is paid and is gotten.");
		}

		public void setSalary(Seller.salary, Bookkeeper.salary){ //////////?????????????????????

			System.out.printl("Salary " + salary+ " is set.");
		}

		public Bookkeeper (string name, boolean isMaster, int experience, int salary){
			this.name = name;
			this.isMaster = isMaster;
			this.experience = experience;
			this.salary = salary;
		}

}



public class Customer {
	String name;
	boolean wholesale;
	boolean regular;
	boolean local;
	
	ArrayList<Good[]> myGoods = new ArrayList<>(); // колекція id елементів, які вибрав користувач
	public void chooseGood(Good obj.id){
		myGoods.add(obj.id); // додаєм елемент в колекцію
	}
	
	public void payGood(ArrayList<Good[]> myGoods){

	}
	public void pickUpTheGoods(ArrayList<Good[]> myGoods){
		return myGoods;
	}
}
public class Provider{
	String name;
	boolean regular;
	boolean reliable;
	
	public void getOrder(){

	}
}
Customer firstCusomer = new Customer();
firstCusomer.name = "Sveta";
firstCusomer.chooseGood(1);
firstCusomer.chooseGood(564);
firstCusomer.chooseGood(3);
Provider Igor = new Provider();
Igor.getOrder(firstCusomer.name,firstCusomer.myGoods);