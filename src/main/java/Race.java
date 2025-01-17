import java.util.ArrayList;

public class Race {
    private String leader;

    public void calculateLeader(ArrayList<Car> cars) {
        int maxDistance = 0;
        for (Car car : cars) {
            int carDistance = 24 * car.getSpeed();
            if (carDistance > maxDistance) {
                maxDistance = carDistance;
                leader = car.getName();
            }
        }
    }

    public String getLeader() {
        return leader;
    }
}
