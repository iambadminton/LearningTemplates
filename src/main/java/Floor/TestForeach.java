package Floor;

/**
 * Created by a.shipulin on 11.05.17.
 */
import java.util.ArrayList;
class ArrLst{

    public static void main(String args[]){

        ArrayList<FloorPoint> l=new ArrayList<FloorPoint>();
        l.add(new FloorPoint(1,1));
        l.add(new FloorPoint(2,2));
        l.add(new FloorPoint(3,3));
        l.add(new FloorPoint(4,4));



//        l.forEach((floorPoint)->System.out.println(floorPoint.getX()));
        for (FloorPoint f:l
             ) {
            System.out.println(f.getX());

        }
    }
}