package src.day42.Inheritance;

public class SingleHouse extends House {

    private boolean backyard;
    private int floors;

    public SingleHouse() {

        this (false, 0,0,0.0);
    }

    public SingleHouse (boolean by, int f, int rooms, double price) {

        super (rooms, price);
        backyard =by;
        floors= f;

    }

    public String partDate() {

        super.isNew(); // this returns true its calling House.isNew
        isNew(); // this return false because it's calling SingleHouse.isNew

        return "01/10/20";
    }

    @Override

    public boolean isNew() {

        return false;
    }

    @Override

    public String toString() {

        return "SingleHouse";
    }

}