
// exception class for checking employee name is empty or not

package Thursday_Lab_10th_aug;

@SuppressWarnings("serial")
public class EmployeeNameInvalidException extends Exception{
	public EmployeeNameInvalidException(String message) {
		super(message);
	}
}
