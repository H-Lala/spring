package app.Service;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public String calc(int x, int y, String op) {
        String result;

        if (Integer.parseInt(String.valueOf(y)) == 0 && op.equals("/")) {
            throw new IllegalAccessError("You are trying divide by zero");

        } else {
            switch (op) {
                case "plus":
                    result = String.valueOf(Integer.parseInt(String.valueOf(x)) + Integer.parseInt(String.valueOf(y)));
                    break;
                case "-":
                    result = String.valueOf(Integer.parseInt(String.valueOf(x)) - Integer.parseInt(String.valueOf(y)));
                    break;
                case "divide":
                    result = String.valueOf(Integer.parseInt(String.valueOf(x)) / Integer.parseInt(String.valueOf(y)));
                    break;
                case "multpy":
                    result = String.valueOf(Integer.parseInt(String.valueOf(x)) * Integer.parseInt(String.valueOf(y)));
                    break;
                default:
                    throw new IllegalAccessError("smth went wrong");
            }

        }
        return result;

    }
}
