public class GameCharacter {
    private CharacterState currentState;
    private int health;

    public GameCharacter() {
        this.currentState = new HealthyState();
        this.health = 100;
    }

    public void setState(CharacterState state) {
        this.currentState = state;
    }

    public void move(){
        currentState.move(this);
    }

    public void attack() {
        currentState.attack(this);
    }

    public void heal() {
        currentState.heal(this);
    }

    public void takeDamage(int damage) {
        currentState.takeDamage(this, damage);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getState() {
        return currentState.getState();
    }


}
