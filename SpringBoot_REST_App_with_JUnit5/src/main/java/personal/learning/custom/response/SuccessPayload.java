package personal.learning.custom.response;

import java.util.Objects;

import org.springframework.http.HttpStatus;

public class SuccessPayload {
	private String successMessage;
	private HttpStatus status;
	
	public SuccessPayload(String successMessage, HttpStatus status) {
		this.successMessage = successMessage;
		this.status = status;
	}

	public String getSuccessMessage() {
		return successMessage;
	}
	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "SuccessPayload [successMessage=" + successMessage + ", status=" + status + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(status, successMessage);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SuccessPayload other = (SuccessPayload) obj;
		return status == other.status && Objects.equals(successMessage, other.successMessage);
	}
	
	
}
