package com.whatsapp.message;

import java.io.Serializable;

public class Message implements Serializable {

	private static final long serialVersionUID = 1L;
	private String messageId;
	private String message;
	private transient String userId; // will be skipped during serialization 

	public String getUserId() {
		return userId+"test";
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Message(String messageId, String message, String userID) {
		super();
		this.messageId = messageId;
		this.message = message;
		this.userId = userID;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
