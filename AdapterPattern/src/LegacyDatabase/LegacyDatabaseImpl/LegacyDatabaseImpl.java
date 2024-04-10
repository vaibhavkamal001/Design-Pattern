package LegacyDatabase.LegacyDatabaseImpl;

import LegacyDatabase.LegacyDatabase;

public class LegacyDatabaseImpl implements LegacyDatabase {
    @Override
    public void insertRecord(String Record) {
        System.out.println("Inserting Record using legacy database :: "+ Record);
    }

    @Override
    public void readAllRecord() {
        System.out.println("Reading all using legacy database records");
    }
}
