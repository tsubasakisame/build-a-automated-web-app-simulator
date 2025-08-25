import java.util.ArrayList;
import java.util.List;

public class WebAppSimulator {

    private List<String> pages;
    private int currentPageIndex;
    private boolean isLoggedIn;

    public WebAppSimulator() {
        this.pages = new ArrayList<>();
        this.currentPageIndex = 0;
        this.isLoggedIn = false;
    }

    public void addPage(String page) {
        this.pages.add(page);
    }

    public void navigateToPage(int pageIndex) {
        if (pageIndex >= 0 && pageIndex < this.pages.size()) {
            this.currentPageIndex = pageIndex;
        }
    }

    public void login(String username, String password) {
        // implement login logic here
        this.isLoggedIn = true;
    }

    public void logout() {
        this.isLoggedIn = false;
    }

    public String getCurrentPage() {
        if (this.currentPageIndex >= 0 && this.currentPageIndex < this.pages.size()) {
            return this.pages.get(this.currentPageIndex);
        } else {
            return "Page not found";
        }
    }

    public boolean isLoggedIn() {
        return this.isLoggedIn;
    }

    public static void main(String[] args) {
        WebAppSimulator simulator = new WebAppSimulator();
        simulator.addPage("Home");
        simulator.addPage("About");
        simulator.addPage("Contact");

        simulator.navigateToPage(1);
        System.out.println("Current page: " + simulator.getCurrentPage());

        simulator.login("username", "password");
        System.out.println("Logged in: " + simulator.isLoggedIn());

        simulator.navigateToPage(2);
        System.out.println("Current page: " + simulator.getCurrentPage());

        simulator.logout();
        System.out.println("Logged in: " + simulator.isLoggedIn());
    }
}