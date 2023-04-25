package Game_Content;

public class Player {
    private String name;
    private int health = 100;
    private int armor = 0;

    //Default constructor
    public Player() {
        this.name = "Player";
    }

    //Constructor with name
    public Player(String name) {
        this.name = name;
    }

    // Debbugging constructor
    public Player(String name, int health, int armor) {
        this.name = name;
        this.health = health;
        this.armor = armor;
    }

    // The heart of the player. 
    public boolean is_alive() {
        return health > 0;
    }

    // Player damage
    public void damage(int damage){
        if (armor > 0 && damage < armor ) {
            armor -= damage;
        } else if (armor > 0 && damage >= armor) {
            damage -= armor;
            armor = 0;
            health -= damage;
        } else {
            health -= damage;
        }
        is_alive();
    }

    @Override
    public String toString() {
        if (is_alive()){
            return "Player {name='" + name + "', health=" + health + ", armor=" + armor + "}";
        } else {
            return (this.name + " is dead");
        }
       
    }

    public static void main(String[] args) {
        Player Steve = new Player("Steve", 100, 50);
        System.out.println(Steve);

        Steve.damage(160);
        System.out.println(Steve);
    }
}
