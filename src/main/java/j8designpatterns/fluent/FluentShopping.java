package j8designpatterns.fluent;

public class FluentShopping {

	public static void main(String[] args) {

				Order.place(order -> order
									.add("shoes")
									.add("Headphones")
									.deliverAt("Street no 45, Jodhpur")
							);



	}

}
