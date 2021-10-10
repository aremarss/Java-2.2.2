public class BmiService {
    public int calculate(int mass, int height) {
        int division = height * height; // Значение роста в квадрате.
        int indexBodyMass = mass * 100 / division; // Формула индекса массы тела.
        return indexBodyMass;
    }
}