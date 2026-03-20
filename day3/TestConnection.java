package orrg.study.org.week3.day3;

public class TestConnection {
    public static void main(String[] args) {

        // Using interface reference
        DatabaseConnection db = new JavaConnection();

        db.connect();
        db.executeUpdate();
        db.disconnect();
    }
}


