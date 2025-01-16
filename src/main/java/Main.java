import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int inputSpeed(Scanner scanner, int count) {
        int speed;
        while (true) {
            System.out.printf("Введите скорость машины %d\n", count);
            speed = scanner.nextInt();

            if (speed > 0 && speed <= 250) {
                break;
            } else {
                System.out.println("Неправильная скорость");
            }
        }
        return speed;
    }

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();
        int count = 1;

        while (true) {
            if (count <= 3) {
                System.out.printf("Введите название машины %d\n", count);
                String name = scanner.next();
                int speed = inputSpeed(scanner, count);

                cars.add(new Car(name, speed));

                count++;
            } else {
                break;
            }
        }

        race.calculateLeader(cars);

        System.out.printf("Самая быстрая машина: %s", race.getLeader());
    }
}
