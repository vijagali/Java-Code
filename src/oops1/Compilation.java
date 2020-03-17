package oops1;

public class Compilation {
	
	//This is known as static polymorphism or compliletime polymorphism  --One to Many

	public static void main(String[] args) {
		Child child = new Child();
		child.car();  // call child car() method and NOT the parent car() method
		child.xbox();
		child.softwareJob();
		
		child.apartment();
		child.restaurent();
		
		child.vintageCar();
		child.bungalow();
		child.farmHouse();
		
		Parent parent = new Parent();
		
		//Parent cant call child methods
		//parent.softwareJob();
		
		Parent parent1 = new Child();        // This is dynamic polymorphism or run time polymorphism  or top casting
		parent1.car();  // call child car() method and NOT the parent car() method
		
		
		//Below is not allowed. Throws exception
	 // 	Child c1 = (Child) new Parent();c1.car();
		
	}

}
