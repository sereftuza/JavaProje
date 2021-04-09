package automat;

public class Runner {

	public static void main(String[] args) {
		
		Products product = new Products();
		Methods methods = new Methods();
		
		double money= methods.money();
		System.out.println("Hesabinizda "+  money  + " dollar var");
		System.out.println(methods.select(product));
		methods.balance(product.getPrice(), money, product);

	}

}
