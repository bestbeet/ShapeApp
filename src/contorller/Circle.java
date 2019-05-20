package contorller;
import java.lang.Math;

public class Circle extends  Shape {

    protected double radius;


    public Circle setRadius(double radius) {
        this.radius = radius;
        onAreaChange();
        onVolumeChange();
        onParimeterChange();
        return this;
    }

    @Override
    public void onAreaChange() {
        this.area = this.radius * this.radius * Math.PI;
    }

    @Override
    protected void onVolumeChange() {
        this.volume = (4/3) * Math.PI * Math.pow(radius,3);
    }

    @Override
    protected void onParimeterChange() {
        this.parimeter = 2*Math.PI* this.radius;
    }


}





