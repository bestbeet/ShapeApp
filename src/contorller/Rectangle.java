package contorller;
import java.lang.Math;

public class Rectangle extends Shape {

    protected double height;
    protected double width;
    protected double longs;


    public Rectangle setHeight(double height) {
        this.height = height;
        onAreaChange();
        onVolumeChange();
        onParimeterChange();
        return this;
    }

    public Rectangle setWidth(double width) {
        this.width = width;
        onAreaChange();
        onVolumeChange();
        onParimeterChange();
        return this;
    }
    public Rectangle setLong(double longs){
        this.longs = longs;
        onVolumeChange();;
        return this;
    }

    @Override
    public void onAreaChange() {
        if ( Double.compare(width,height) == 1 ){

            this.area = height * width ;

        }
        else {

            this.area = width * height;

        }
    }

    @Override
    protected void onVolumeChange() {

        if ( Double.compare(Double.compare(longs,height),width) == 1 ){

            this.volume = Math.pow(longs,3);

        }
        else {

            this.volume = longs * width * height;

        }

    }

    @Override
    protected void onParimeterChange() {

        if ( Double.compare(width,height) == 1 ){

            this.parimeter = width * 4 ;

        }
        else {

            this.parimeter = (height + width) * 2;

        }


    }
}
