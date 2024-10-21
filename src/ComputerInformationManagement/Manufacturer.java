package ComputerInformationManagement;

public class Manufacturer {
    private String brandName;
    private Nation nation;

    public Manufacturer(String brandName, Nation nation) {
        this.brandName = brandName;
        this.nation = nation;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

}
