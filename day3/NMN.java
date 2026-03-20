package orrg.study.org.week3.day3;

public class NMN extends MySqlConnection {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL Database.");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from Database.");
    }

    @Override
    public void executeUpdate() {
        System.out.println("Update executed successfully.");
    }
    @Override
    public void executeQuery() {
        System.out.println("Query executed successfully.");
    }

    public static void main(String[] args) {

        NMN db = new NMN();

        db.connect();
        db.executeQuery();
        db.executeUpdate();
        db.disconnect();
    }
}

