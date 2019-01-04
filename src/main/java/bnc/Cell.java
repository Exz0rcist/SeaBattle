package main.java.bnc;

public class Cell {
    private char cellMark;
    private boolean isShooted = false;
    private boolean isShip = false;

    public char getCellMark() {
        return cellMark;
    }

    public void setCellMark(char cellMark) {
        this.cellMark = cellMark;
    }

    public boolean isShooted() {
        return isShooted;
    }

    public void setShooted(boolean shooted) {
        isShooted = shooted;
    }

    public boolean isShip() {
        return isShip;
    }

    public void setShip(boolean ship) {
        isShip = ship;
    }
}
