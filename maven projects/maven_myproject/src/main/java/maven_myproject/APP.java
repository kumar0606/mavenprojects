package maven_myproject;

import java.util.ResourceBundle;

public class APP {
public int userlogin(String in_userid,String in_pwd) {
	ResourceBundle rb= ResourceBundle.getBundle("ravi");
	String userName= rb.getString("UserName");
	String Password = rb.getString("Password");
	if(in_userid.equals(userName) && in_pwd.equals(Password))
	return 1;
	else 
		return 0;
	
}
}
