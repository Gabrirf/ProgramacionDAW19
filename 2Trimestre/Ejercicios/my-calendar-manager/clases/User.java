package clases;

public class User {

	String name;
	String password;
	ArrayList<Calendar> calendars;

	public User(String name, String password){
		this.name = name;
		this.password = password;
		this.calendars = new ArrayList<Calendar>();
	}
}