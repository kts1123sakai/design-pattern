package facade;

public class Client {

	public static void main(String[] args) {

		SampleFacade facade = new SampleFacade();

		try {
			System.out.println(facade.calc("AAA"));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println(facade.calc("BBB"));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println(facade.calc("CCC"));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println(facade.calc("DDD"));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println(facade.calc(""));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println(facade.calc(null));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
