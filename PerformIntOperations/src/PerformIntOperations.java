import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PerformIntOperations {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
			list.add((int) (Math.random() * 1000) % 100);
		}
		Consumer<Integer> consumerPrint = System.out::println;

		Predicate<Integer> predicateEven = (element) -> (element % 2 == 0) ? true : false;
		Predicate<Integer> predicateOdd = (element) -> (element % 2 == 0) ? false : true;
		Predicate<Integer> predicateDivideBySix = (element) -> (element % 6 == 0) ? true : false;
		Predicate<Integer> predicateLessThanTwelve = (element) -> (element < 12) ? true : false;
		Predicate<Integer> predicateGreaterThanFifty = (element) -> (element > 50) ? true : false;
	}
	
	System.out.println("All integers in the are");
	list.stream().forEach(consumerprint);
	
	System.out.println("All even elements are: ");
	list.stream().filter(predicateEven).forEach(consumerprint);
	
	System.out.println("All odd elements are: ");
	list.stream().filter(predicateOdd).forEach(consumerprint)

	System.out.println("All elements divisible by 6 are: ");
	list.stream().filter(predicateDivideBySix).forEach(consumerprint);
	
	
	System.out.println("All elements less than 12 are: ");
	list.stream().filter(predicateLessThanTwelve).forEach(consumerprint);
	
	System.out.println("All elements greater than 50 are: ");
	list.stream().filter(predicateGreaterThanFifty).forEach(consumerprint);
	
}
