public class Task3 {
    public static void main(String[] args) {
        SchoolProxyInternet internet = new SchoolProxyInternet();
        internet.connectTo("wikipedia.org");
        internet.connectTo("gaming.com");
    }
}
