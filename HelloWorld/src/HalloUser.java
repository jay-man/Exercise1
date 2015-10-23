public class HalloUser {

	private String userName;

	public HalloUser(String userName) {
		this.userName = userName;
	}

	public void greetUser() {
		System.out.println("Hello " + userName + "!");
	}

}
