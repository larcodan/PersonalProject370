public class Main {
    public static void main(String[] args){
        GameCharacter myPlayer = new GameCharacter();

        System.out.println("Starting Game....");
        // First Playthrough:
        System.out.println("Round 1: \nPlayer Health: " + myPlayer.getHealth() + " \nPlayer State: " + myPlayer.getState());
        myPlayer.attack();
        myPlayer.move();
        myPlayer.takeDamage(50);
        myPlayer.attack();
        myPlayer.move();
        //Second Playthrough:
        System.out.println("Round 2: \nPlayer Health: " + myPlayer.getHealth() + " \nPlayer State: " + myPlayer.getState());
        myPlayer.heal();
        myPlayer.move();
        myPlayer.takeDamage(70);
        myPlayer.attack();
        myPlayer.move();
        myPlayer.heal();
        myPlayer.takeDamage(10);
        //Ending:
        System.out.println("Game Over: \nPlayer Health: " + myPlayer.getHealth() + " \nPlayer State: " + myPlayer.getState());
    }

    // @Test
    // void addition() {
    //     assertEquals(2, 1 + 1);
    // }
}
