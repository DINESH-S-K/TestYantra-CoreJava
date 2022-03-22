package com.tyss.corejava;

public class UpcastingAndDowncasting {
	public static void main(String[] args) {
		User user = new Admin("Gokul",9857473845l);
		user.call();
		user.videocalling();
		user.share();
		
		Admin admin = ( Admin ) user;
		admin.call();
		admin.videocalling();
		admin.share();
		admin.Adduser("Mahesh", 3943932378l);
		admin.RemoveUser("Gokul", 9857473890l);
	}

}
