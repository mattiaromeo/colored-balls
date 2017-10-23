
import org.assertj.core.api.Assertions;
import org.junit.Test;


public class BallTest {
    @Test
    public void ballWithParameterBlue_shouldReturnBlueBall() throws Exception {
        Ball blue = Ball.getInstance("Blue");
        Assertions.assertThat(blue.getColor()).isEqualTo("Blue");

    }

    @Test
    public void anotherBallWithParameterBlue_shouldReturnSameBlueBall() throws Exception {

        Ball blue = Ball.getInstance("Blue");
        Ball red = Ball.getInstance("RED");
        Assertions.assertThat(red.getColor()).isEqualTo("RED");

    }

    @Test
    public void ballWithParameterRed_ShouldReturnRedBall() throws Exception {
        Ball red = Ball.getInstance("RED");
        Assertions.assertThat(red.getColor()).isEqualTo("RED");
    }
}