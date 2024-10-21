package MovieManagement;

public class Manufacturer {
    private String name;
    private String nation;

    public Manufacturer(String name, String nation) {
        this.name = name;
        this.nation = nation;
    }

    public String getName() {
        return name;
    }

    public String getNation() {
        return nation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return name + ", Nation: " + nation;
    }
}
