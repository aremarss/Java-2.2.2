public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int BmiServiceOne = service.calculate(85_00, 1_85); // Масса до грамм и рост до сантиметров.
        System.out.println("Индекс массы тела: " + BmiServiceOne + " кг/м².");
    }
}