public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Health Remaining " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 189;
//        player.loseHealth(damage);
//        System.out.println("Health Remaining " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("kevin", 200, "sword");
        System.out.println("health is : " + player.getHealth());

    }
}