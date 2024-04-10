
import LegacyDatabase.LegacyDatabase;
import ModernDatabase.ModernDatabase;

public class LegacyDatabaseAdapter implements ModernDatabase {
    LegacyDatabase legacyDatabase;

    public LegacyDatabaseAdapter(LegacyDatabase legacyDatabase) {
        this.legacyDatabase = legacyDatabase;
    }


    @Override
    public void save(String data) {
        legacyDatabase.insertRecord(data);
    }

    @Override
    public void findAll() {
        legacyDatabase.readAllRecord();
    }
}
