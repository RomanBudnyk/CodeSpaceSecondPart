package com.codespace.task123;

public class Monitor extends Derive {
    private int resolutionX;
    private int resolutionY;

    public Monitor() {
    }
    public Monitor(String serialNumber, String manufacturer, double price, int resolutionX, int resolutionY) {
        super(serialNumber, manufacturer, price);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }
    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }
    public int getResolutionY() {
        return resolutionY;
    }
    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", resolutionX = " + resolutionX +
                ", resolutionY = " + resolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor)) return false;
        if (!super.equals(o)) return false;

        Monitor monitor = (Monitor) o;

        if (resolutionX != monitor.resolutionX) return false;
        return resolutionY == monitor.resolutionY;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + resolutionX;
        result = 31 * result + resolutionY;
        return result;
    }
}
