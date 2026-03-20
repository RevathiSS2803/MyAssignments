package orrg.study.org.week3.day3;

public class JavaConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Database connected successfully.");
    }

    @Override
    public void disconnect() {
        System.out.println("Database disconnected.");
    }

    @Override
    public void executeUpdate() {
        System.out.println("Update query executed.");
    }
}

