package ComputerInformationManagement;

public class InformationComputer {
    private Manufacturer manufacturer;
    private Date dateOfManufacture;
    private float price;
    private int warrantyPeriodInMonths;


    public String CheckComputerPrice(InformationComputer computer){
        if (this.price < computer.getPrice()){
            return "This computer is cheaper";
        }
        return "This computer costs more";
    }

    public void ManufacturingCountryName(){
        System.out.println("The country that manufactured this computer is: " + this.manufacturer.getNation());
    }

    public InformationComputer(Manufacturer manufacturer, Date dateOfManufacture, float price, int warrantyPeriodInMonths) {
        this.manufacturer = manufacturer;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
        this.warrantyPeriodInMonths = warrantyPeriodInMonths;
    }

    public InformationComputer() {}

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(Date dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getWarrantyPeriodInMonths() {
        return warrantyPeriodInMonths;
    }

    public void setWarrantyPeriodInMonths(int warrantyPeriodInMonths) {
        this.warrantyPeriodInMonths = warrantyPeriodInMonths;
    }
}
