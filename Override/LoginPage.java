package orrg.study.org.week3.day3.Override;

public class LoginPage extends BasePage {
     @Override
    public void performCommonTasks() {
        System.out.println("Performing login-specific tasks...");
    }
    public static void main(String[] args) {

        // Base class object
        BasePage base = new BasePage();
        base.findElement();
        base.clickElement();
        base.enterText();
        base.performCommonTasks();

        System.out.println("-------------");

        // Subclass object
        LoginPage login = new LoginPage();
        login.findElement();
        login.clickElement();
        login.enterText();
        login.performCommonTasks(); // Overridden method
    }

}
