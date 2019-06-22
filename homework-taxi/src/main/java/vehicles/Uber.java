package vehicles;

import vehicles.exceptions.WrongLocationException;

import java.awt.*;

public class Uber extends Taxi {
    private Point location;
    private double avgSpeed = 12;

    public Uber(boolean isOccupied, Point location) {
        super(isOccupied);
        this.location = location;
    }

    public double timeToDestination(Point userLocation) {
        double distance = 0;
        try {
            distance = countDistance(userLocation);
        } catch (WrongLocationException e) {
            e.printStackTrace();
            distance = 0;
            System.out.println("negative user location provided. Distance falls to default 0 value");
        }

        return distance / avgSpeed;
    }

    public double countDistance(Point userLocation) throws WrongLocationException {
        if (userLocation.getX() < 0 || userLocation.getY() < 0)
            throw new WrongLocationException("asd");


        return userLocation.distance(location);
    }
}
