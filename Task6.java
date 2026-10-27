public class Task6 {
    public static void main(String[] args) {
        Knight swordKnight = new Knight(new Sword());
        swordKnight.attack();
        Knight wandKnight = new Knight(new MagicWand());
        wandKnight.attack();
    }
}
