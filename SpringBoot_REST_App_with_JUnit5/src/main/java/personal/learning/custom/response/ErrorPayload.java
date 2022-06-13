package personal.learning.custom.response;

import java.util.Objects;

import org.springframework.http.HttpStatus;

public class ErrorPayload {
	
	private String errorMessage;
	private HttpStatus status;
	
	public ErrorPayload(String errorMessage, HttpStatus status) {
		this.errorMessage = errorMessage;
		this.status = status;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ErrorPayload [errorMessage=" + errorMessage + ", status=" + status + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(errorMessage, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ErrorPayload other = (ErrorPayload) obj;
		return Objects.equals(errorMessage, other.errorMessage) && status == other.status;
	}
	
	
	
}
