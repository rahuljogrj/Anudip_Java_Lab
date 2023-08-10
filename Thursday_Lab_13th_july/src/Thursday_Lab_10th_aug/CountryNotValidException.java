
// exception class for checking country


package Thursday_Lab_10th_aug;

@SuppressWarnings("serial")
public class CountryNotValidException extends Exception {
	public CountryNotValidException(String message) {
		super(message);
	}
}
