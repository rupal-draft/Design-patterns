package solid_principles.liskov.good;

/**
 * This is good we are bothered to provide secure loan type
 * so this will behave perfectly fine even if we substitute between parent
 * and child.
 */

public class LoanClosureService {
    private final SecureLoan secureLoan;

    public LoanClosureService(SecureLoan secureLoan) {
        this.secureLoan = secureLoan;
    }

    public void forceCloseLoan(){
        secureLoan.forcecloseloan();
    }
}
