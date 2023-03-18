package homework04.Comparators;
import homework04.Units.BaseUnit;
import java.util.Comparator;



/**
 * SpeedComp
 */
public class SpeedComparator implements Comparator<BaseUnit> {

    @Override
    public int compare(BaseUnit unit1, BaseUnit unit2) {
        return (unit2.getSpeed()-unit1.getSpeed());

    }

    
}