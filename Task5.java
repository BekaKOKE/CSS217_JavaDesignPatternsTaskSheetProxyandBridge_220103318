public class Task5 {
    public static void main(String[] args) {
        Device radio = new Radio();
        PartyRemote remote = new PartyRemote(radio);
        remote.partyMode();
    }
}
