package Model;

import com.BaS.Model.Circle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {
    @Test
    public void toStringTest ()
    {
        Circle circle = new Circle(5);
        String controlValue = "diameter: "+"10"+"; square: "+"49,348"+"; perimeter: "+"31,4159"+";";
        assertEquals(controlValue, circle.toString());
    }
    @Test
    public void circleTest()
    {
        Circle circle = new Circle(5);
        assertEquals(10,circle.getDiameter(),0.05);
    }
}
