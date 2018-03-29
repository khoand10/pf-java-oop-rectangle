import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.omg.CORBA.StringHolder;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    @Disabled("input width = 4 height = 35")
    void testContructor(){
        Rectangle retangle = new Rectangle(4 , 40);
        System.out.println(String.format("Info :"+retangle.toString()));
        System.out.println(String.format("Area :"+retangle.getArea()));
        System.out.println(String.format("Perimeter :"+retangle.getPerimeter()));
    }

    @Test
    void testContructor2(){
        Rectangle retangle = new Rectangle(3.5 , 35.9);
        System.out.println(String.format("Info :"+retangle.toString()));
        System.out.println(String.format("Area :"+retangle.getArea()));
        System.out.println(String.format("Perimeter :"+retangle.getPerimeter()));
    }

}