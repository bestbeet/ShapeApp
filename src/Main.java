import contorller.CalculatGUI;
import contorller.Rectangle;
import contorller.Shape;
import contorller.ShapeCalculat;

import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
        Rectangle rectangle1 = new Rectangle();
        ShapeCalculat shape = new ShapeCalculat();

        shape.setVisible(true);



        rectangle1.setWidth(4);
        rectangle1.setHeight(4);
        rectangle1.setLong(2);


        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getVolume());
        System.out.println(rectangle1.getParimeter());



    }
}
