package springmvc.model;

public class User {
private String email;
private String userName;
private String pass;

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
@Override
public String toString() {
	return "User [email=" + email + ", userName=" + userName + ", pass=" + pass + "]";
}




}
