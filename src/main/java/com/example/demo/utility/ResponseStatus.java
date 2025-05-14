package com.example.demo.utility;

public class ResponseStatus {

	
	private int errorCode;
	private String errorMessage;
	
	public ResponseStatus(int errorCode, String errorMessage) {
		
		super();
		this.errorCode=errorCode;
		this.errorMessage=errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	@Override
	public String toString() {
		
		return "ResponseStatus [errorCode = " + errorCode + " , errorMessage = " + errorMessage + "]";
		
	}
	
	
}
