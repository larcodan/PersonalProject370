public class HealthyState implements CharacterState {
    public void move(GameCharacter character) {
        System.out.println("Character is moving with full speed");
    }
    public void attack(GameCharacter character){
        System.out.println("Character is attacking with full force");
    }
    public void heal(GameCharacter character){
        if (character.getHealth() >= 100){
            System.out.println("Character is already at full health");
        }
        else {
            System.out.println("Character is currently healing");
            character.setHealth(character.getHealth() + 20);
        }
    }
    public void takeDamage(GameCharacter character, int damage) {
        System.out.println("Character has taken " + damage + " damage");
        if (character.getHealth() - damage <= 0){
            character.setState(new EliminatedState());
        }
        else if (character.getHealth() - damage <= 50){
            character.setState(new InjuredState());
        }
        character.setHealth(character.getHealth() - damage);
    }

    public String getState() {
        return "Healthy";
    }

}
