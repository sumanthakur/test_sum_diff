package org.testproj.api.validator;

public class ErrorResponse {
	public String status;
	public String reason;
	public ErrorResponse(String status, String reason) {
		super();
		this.status = status;
		this.reason = reason;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
}
