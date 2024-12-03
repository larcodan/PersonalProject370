public class InjuredState implements CharacterState {
    public void move(GameCharacter character) {
        System.out.println("Character is moving slowly");
    }
    public void attack(GameCharacter character) {
        System.out.println("Character is attacking with reduced force");
    }
    public void heal (GameCharacter character) {
        System.out.println("Character is currently healing");
        character.setHealth(character.getHealth() + 20);
        if (character.getHealth() > 50) {
            character.setState(new HealthyState());
        }
    }
    public void takeDamage(GameCharacter character, int damage) {
        System.out.println("Character has taken " + damage + " damage");
        if (character.getHealth() - damage <= 0) {
            character.setState(new EliminatedState());
        }
        character.setHealth(character.getHealth() - damage);
    }

    public String getState() {
        return "Injured";
    }
}
