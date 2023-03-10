public class Toy {
    private int id;
    private String name;
    private double chance;

    public Toy(int id, String name, double chance) {
        this.id = id;
        this.name = name;
        this.chance = chance;
    }

    private void setId(int id) {
        this.id = id;
    }

    public void setChance(double chance) {
        this.chance = chance;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getChance() {
        return chance;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("id: %d name: %s chance: %f", this.getId(), this.getName(), this.getChance());
    }

    @Override
    public boolean equals(Object obj) {
        Toy eqToy = (Toy) obj;
        return this.getId() == eqToy.getId();
    }
}
