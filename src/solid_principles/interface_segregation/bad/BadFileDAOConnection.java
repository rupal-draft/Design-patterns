package solid_principles.interface_segregation.bad;

public class BadFileDAOConnection implements BadDAOInterface {
    @Override
    public void openConnection() {
        throw new UnsupportedOperationException("DB connection is not supported");
    }

    @Override
    public void createRecord() {

    }

    @Override
    public void openFile() {

    }

    @Override
    public void deleteRecord() {

    }
}
