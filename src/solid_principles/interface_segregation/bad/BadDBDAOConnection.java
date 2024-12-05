package solid_principles.interface_segregation.bad;

public class BadDBDAOConnection implements BadDAOInterface {
    @Override
    public void openConnection() {

    }

    @Override
    public void createRecord() {

    }

    @Override
    public void openFile() {
        throw new UnsupportedOperationException("Open file is not supported");
    }

    @Override
    public void deleteRecord() {

    }
}
