package contorller;


public abstract class Shape{

    protected double area,volume,parimeter;

        public double getArea(){

            return area;

        }

        public double getVolume(){

            return volume;

        }

        public double getParimeter(){

            return parimeter;

        }

        protected abstract void onAreaChange();

        protected abstract void onVolumeChange();

        protected abstract void onParimeterChange();

}





