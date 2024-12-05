package solid_principles.liskov.bad;

public class CreditCardLoan implements LoanPayement{
    @Override
    public void dopayment(int amount) {

    }

    @Override
    public void forcecloseloan() {
        throw new UnsupportedOperationException("Force close loan is not allowed!!");
    }

    @Override
    public void dorepayment(int amount) {

    }
}
