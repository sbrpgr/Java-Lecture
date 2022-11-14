package ch10.ex11_userDefinedException;

public class BalanceInsufficientException extends RuntimeException {
	BalanceInsufficientException() { }

	BalanceInsufficientException(String message) {
		super(message);
	}
}