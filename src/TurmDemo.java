public class TurmDemo {

    public static void main(String[] args) {
        int number = 25;
        int count = 2;
        int result;

        while (count <= 9) {
            result = count * number;
            System.out.println(number + " * " + count + " = " + result);
            number = result;
            count++;
        }

        // reset count
        count = 2;

        while (count <= 9) {
            result = number / count;
            System.out.println(number + " / " + count + " = " + result);
            number = result;
            count++;
        }

    }
}
