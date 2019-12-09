package app.entity;

public class Calculator {
    private int x;
    private int y;
    private String op;

    public Calculator(int x, int y, String op) {
        this.x = x;
        this.y = y;
        this.op = op;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getOp() {
        return op;
    }
}
