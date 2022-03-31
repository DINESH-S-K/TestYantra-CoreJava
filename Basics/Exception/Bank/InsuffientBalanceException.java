package com.tyss.corejava.Exception.Bank;

public class InsuffientBalanceException extends RuntimeException {
//    private String msg;
	public InsuffientBalanceException(String msg) {
//		this.msg = msg;
		super(msg);
	}

//	public String getMsg() {
//		return msg;
//	}
  
}
