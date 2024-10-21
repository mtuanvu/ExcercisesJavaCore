package ComputerInformationManagement;

public class Nation {
    private float countryCode;
    private String countryName;

    public Nation(float countryCode, String countryName) {
        this.countryCode = countryCode;
        this.countryName = countryName;
    }

    public float getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(float countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return countryName;
    }
}
