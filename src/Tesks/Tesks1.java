package Tesks;

public class Tesks1 {
}

class Train {
    public static void main(String[] args) {
        Train train = new Train();
        train.setSpeed(232);
        train.setWagons(3);
        train.setDistance(3);
        train.getTime();
        System.out.println(train);
        System.out.println(Thread.currentThread().getState().toString());

    }

    double speed;
    double distance;
    int wagons;
    double time;

    public void setSpeed(double speed) {
        this.speed = speed;

    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setWagons(int wagons) {
        this.wagons = wagons;
    }

    public double getTime() {
        return time = distance / (speed / wagons);
    }

    @Override
    public String toString() {
        return "Train{" +
                "speed=" + speed +
                ", distance=" + distance +
                ", wagons=" + wagons +
                ", time=" + time +
                '}';
    }
}

