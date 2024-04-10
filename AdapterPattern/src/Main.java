import LegacyDatabase.LegacyDatabase;
import LegacyDatabase.LegacyDatabaseImpl.LegacyDatabaseImpl;
import ModernDatabase.ModernDatabase;
import ModernDatabase.ModernDatabaseImpl.ModernDatabaseImpl;

public class Main {
    public static void main(String[] args) {
        LegacyDatabase simpleLegacyDatabase = new LegacyDatabaseImpl();
        ModernDatabase simpleModernDatabase = new ModernDatabaseImpl();

        LegacyDatabaseAdapter legacyAdapter = new LegacyDatabaseAdapter(simpleLegacyDatabase);

        TestDuck(legacyAdapter);
        TestDuck(simpleModernDatabase);
    }

    static void TestDuck(ModernDatabase modernDatabase){
        modernDatabase.save("New Record");
        modernDatabase.findAll();
    }
}