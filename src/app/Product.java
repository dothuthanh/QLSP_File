package app;

public class Product {
    private int ProductCode;
    private String ProductName;
    private String Manufacturer;
    private double Prime;
    private String Description;

    public Product(int productCode, String productName, String manufacturer, double prime, String description) {
        ProductCode = productCode;
        ProductName = productName;
        Manufacturer = manufacturer;
        Prime = prime;
        Description = description;
    }

    public int getProductCode() {
        return ProductCode;
    }

    public void setProductCode(int productCode) {
        ProductCode = productCode;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public double getPrime() {
        return Prime;
    }

    public void setPrime(double prime) {
        Prime = prime;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getValue(){
        return ProductCode+","+ ProductName+","+Manufacturer+","+Prime+","+Description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ProductCode=" + ProductCode +
                ", ProductName='" + ProductName + '\'' +
                ", Manufacturer='" + Manufacturer + '\'' +
                ", Prime=" + Prime +
                ", Description='" + Description + '\'' +
                '}';
    }
}
