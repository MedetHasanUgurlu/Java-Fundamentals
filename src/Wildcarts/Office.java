package Wildcarts;

public class Office extends Building{
    private int officeRooms = 57;

    @Override
    public int getNumberOfRooms() {
        return officeRooms;
    }

    @Override
    public void setNumberOfRooms(int numberOfRooms) {
        officeRooms = numberOfRooms;
    }
}
