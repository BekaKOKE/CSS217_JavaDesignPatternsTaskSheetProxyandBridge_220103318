public class Task1 {
    public static void main(String[] args) {
        Image guestView = new ProxyImage("salary_sheet.png", "GUEST");
        Image adminView = new ProxyImage("salary_sheet.png", "ADMIN");
        guestView.show();
        adminView.show();
    }
}
