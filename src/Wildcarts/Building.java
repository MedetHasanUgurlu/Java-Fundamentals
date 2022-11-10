package Wildcarts;

public class Building {
    private int numberOfRooms=2;

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public String toString() {
        return "Building{" +
                "numberOfRooms=" + numberOfRooms +
                '}';
    }
}
