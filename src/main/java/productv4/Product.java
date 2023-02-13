package productv4;

import java.text.NumberFormat;

public class Product {

    private String code;
    private String description;
    private double price;
    private String label;
    private String screenSize;
    private String manufacture;
    protected static int count = 0;

    public Product() {
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    public void setLabel(String label) { this.label = label;
    }

    public String getLabel() { return label;}

    public void setScreenSize(String screenSize) { this.screenSize = screenSize;
    }

    public String getScreenSize() { return screenSize;}

    public void setManufacture(String manufacture) { this.manufacture = manufacture;
    }

    public String getManufacture() { return manufacture;}

    @Override
    public String toString() {
        return description;
    }

    public static int getCount() {
        return count;
    }
}