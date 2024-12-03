public interface CharacterState {
    public void move(GameCharacter character);
    public void attack(GameCharacter character);
    public void heal(GameCharacter character);
    public void takeDamage(GameCharacter character, int damage);
    String getState();
}
