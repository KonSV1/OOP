package srp.Model;

import srp.Model.User;

public class Persister{
	private final String user;


	public Persister(String user){
		this.user = user;
	}


	public static void preservationUser(User user) {
		// некая логика сохранения пользователя
	}
}