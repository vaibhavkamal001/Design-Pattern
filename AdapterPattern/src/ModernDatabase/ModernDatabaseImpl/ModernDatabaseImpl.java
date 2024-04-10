package ModernDatabase.ModernDatabaseImpl;

import ModernDatabase.ModernDatabase;

public class ModernDatabaseImpl implements ModernDatabase {

    @Override
    public void save(String data) {
        System.out.println("Saving the records using modern database :: "+ data);
    }

    @Override
    public void findAll() {
        System.out.println("Reading the all records using modern database");
    }
}
