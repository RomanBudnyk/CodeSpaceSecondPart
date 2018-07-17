package com.codespace.task123;

public class Derive {
    private String serialNumber;
    private String manufacturer;
    private double price;

    public Derive() {
    }

    public Derive(String serialNumber, String manufacturer, double price) {
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "class = " + this.getClass().getSimpleName() +
                ": serialNumber = " + serialNumber +
                ", manufacturer = " + manufacturer +
                ", price = " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Derive)) return false;

        Derive derive = (Derive) o;

        if (Double.compare(derive.price, price) != 0) return false;
        if (serialNumber != null && !serialNumber.equals(derive.serialNumber) )
            return false;
        return manufacturer != null && manufacturer.equals(derive.manufacturer);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = serialNumber != null ? serialNumber.hashCode() : 0;
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
