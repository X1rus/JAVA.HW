package Video9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW2 {
    public static void main(String[] args) throws MyException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            readNumber(1, 100, br);
        }

        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int readNumber(int start, int end, BufferedReader br) throws MyException {

        System.out.println("Input number");

        int read = -1;
        try {
            read = Integer.parseInt(br.readLine());

        } catch (NumberFormatException | IOException e) {
            System.out.println("Invalid number or non-number, text is read");
            return -1;
        }

        if (read < start || read > end)
            throw new MyException("Number isn't in the range");

        return read;

    }
}
