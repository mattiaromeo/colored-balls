public class Ball {
    private static Ball ball;
    private String color;

    private Ball(String color) {
        this.color = color;
    }

    public void bounce() {
        System.out.println("boing!");
    }

    public static Ball getInstance(String color) {
        if (ball == null) {
            ball = new Ball(color);
        } else {
            if (ball.getColor().equals(color)) {
                return ball;
            }
            else{
                ball = new Ball(color);
            }
        }

        return ball;

    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;

        return color != null ? color.equals(ball.color) : ball.color == null;
    }

    @Override
    public int hashCode() {
        return color != null ? color.hashCode() : 0;
    }
}

