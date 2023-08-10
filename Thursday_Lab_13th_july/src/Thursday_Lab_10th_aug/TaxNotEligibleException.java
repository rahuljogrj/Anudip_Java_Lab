
// exception class for checking employee salary

package Thursday_Lab_10th_aug;

@SuppressWarnings("serial")
public class TaxNotEligibleException extends Exception{
	public TaxNotEligibleException(String message) {
		super(message);
	}
}
