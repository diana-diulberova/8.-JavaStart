package Homework_6;

public class Laptop {
    private float diagonal;
    private String screenType;
    private int RAM;
    private int SSD;
    private int core;
    private String os;
    private String manufacturer;

    public Laptop (String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(float diagonal) {
        this.diagonal = diagonal;
    }

    public int getScreenType() {
        if (screenType.equals("TN")) return 1; 
        else if (screenType.equals("VA")) return 2;
        else return 3;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getSSD() {
        return SSD;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    public int getcore() {
        return core;
    }

    public void setcore(int core) {
        this.core = core;
    }

    public int getOs() {
        if (os.equals("MacOs")) return 1; 
        else if (os.equals("Linux")) return 2;
        else return 3;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getmanufacturer() {
        return manufacturer;
    }

    public void setmanufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Notebook{" + 
                "manufacturer=" + manufacturer +
                ", diagonal='" + diagonal + '\'' +
                ", screenType=" + screenType +
                ", RAM=" + RAM +
                ", SSD=" + SSD +
                ", core=" + core +
                ", os=" + os +
                '}';
    }
}