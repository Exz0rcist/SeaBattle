package main.java.bnc;

public class Ship {
    private byte coordinateX;
    private byte coordinateY;
    private byte size;
    private ORIENTATION orientation;

    public Ship(byte coordinateX, byte coordinateY, byte size, ORIENTATION orientation) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.size = size;
        this.orientation = orientation;
    }

    public Ship(byte coordinateX, byte coordinateY, byte size) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.size = size;
    }

    public byte getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(byte coordinateX) {
        this.coordinateX = coordinateX;
    }

    public byte getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(byte coordinateY) {
        this.coordinateY = coordinateY;
    }

    public byte getSize() {
        return size;
    }

    public void setSize(byte size) {
        this.size = size;
    }

    public ORIENTATION getOrientation() {
        return orientation;
    }

    public void setOrientation(ORIENTATION orientation) {
        this.orientation = orientation;
    }
}
