package solid_principles.liskov.good;

public class HomeLoan implements SecureLoan{
    @Override
    public void forcecloseloan() {

    }

    @Override
    public void dopayement(int amount) {

    }
}
