package solid_principles.liskov.good;

public interface SecureLoan extends LoanPayement{
    public void forcecloseloan();
}
