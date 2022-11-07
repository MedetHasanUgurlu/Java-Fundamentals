package Enumeration;

public enum Color {
    RED("red"),BLUE("green"),ORANGE("orange"),GREEN("green"),BLACK("black");

    private String value;
    Color(String value) {
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
