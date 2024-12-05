package solid_principles.liskov.bad;

public class HomeLoan implements LoanPayement{
    @Override
    public void dopayment(int amount) {

    }

    @Override
    public void forcecloseloan() {

    }

    @Override
    public void dorepayment(int amount) {

    }
}
