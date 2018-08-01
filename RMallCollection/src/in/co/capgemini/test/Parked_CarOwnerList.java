package in.co.capgemini.test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Parked_CarOwnerList {

	Set<Parked_CarOwner_Details> car = new LinkedHashSet<>();
	int token = 0;

	// method to add a new car
	public void addNewCar(Parked_CarOwner_Details carModel) {
		car.add(carModel);
		token = token+1;
		System.out.println(carModel.getCarModel() + "added");
	}

	// method to remove a car
	public void removeCar(String carModel) {
		Predicate<Parked_CarOwner_Details> delcar = Parked_CarOwner_Details -> Parked_CarOwner_Details.getCarModel().equals(carModel);
		car.removeIf(delcar);
	}

	public void getParkedCarLocation() {
		
		int token = 1, section = 1, floor = 0;
		
		if(token>2) {
			token=1;
			section++;
		}else if(section>2) {
			section=1;
			floor++;
		}else if(floor>1) {
			System.out.println("no space");
		}

	}

	// method to display car details
	public void display() {
		Consumer<Parked_CarOwner_Details> disp = Parked_CarOwner_Details -> System.out.println(Parked_CarOwner_Details);
		car.stream().forEach(disp);
	}

}
