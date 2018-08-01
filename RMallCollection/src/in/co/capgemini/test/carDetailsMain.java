package in.co.capgemini.test;

public class carDetailsMain {

	public static void main(String[] args) {

		Parked_CarOwnerList car = new Parked_CarOwnerList();

		car.addNewCar(new Parked_CarOwner_Details("Ritu", "Benz", 1234, 741134535, "Bangalore"));
		car.addNewCar(new Parked_CarOwner_Details("Peter", "Swift", 6734, 886134535, "Mumbai"));
		car.addNewCar(new Parked_CarOwner_Details("Madhu", "Nano", 7564, 996134897, "Chennai"));

		// Display car details
		car.display();

		// remove a car from the collection
		car.removeCar("Swift");
		System.out.println("car detials after removing -------------------");
		car.display();

	}

}
