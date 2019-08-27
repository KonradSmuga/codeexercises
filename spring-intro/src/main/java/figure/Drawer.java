package figure;

public class Drawer {

    final Shape shape;

    //Dependency Injcetion - odwrocenie zależności.
    public Drawer(final Shape shape){
        this.shape = shape;
    }

    public String doDrawing() {

    return shape.draw();
    }


}

