package solid_principles.interface_segregation.good;

//Implemented method what is actual being operated by this.
//We don't had to bother about file operation as interface segregated.

public class FileDAOConnection implements DAOInterface,FileInterface{
    @Override
    public void createRecord() {

    }

    @Override
    public void deleteRecord() {

    }

    @Override
    public void openFile() {

    }
}
