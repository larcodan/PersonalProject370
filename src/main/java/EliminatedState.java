public class EliminatedState implements CharacterState {
    public void move(GameCharacter character){
        System.out.println("Unable to Move, Character has been Eliminated");
    }
    public void attack(GameCharacter character){
        System.out.println("Unable to Attack, Character has been Eliminated");
    }
    public void heal(GameCharacter character){
        System.out.println("Unable to Heal, Character has been Eliminated");
    }
    public void takeDamage(GameCharacter character, int damage){
        System.out.println("Unable to take Damage, Character has been Eliminated");
    }

    public String getState(){
        return "Eliminated";
    }

}
