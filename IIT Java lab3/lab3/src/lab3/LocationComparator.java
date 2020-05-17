package lab3;
import java.util.Comparator;


public class LocationComparator implements Comparator<BankRecords> {

    @Override
    public int compare(BankRecords o1, BankRecords o2) {
        // TODO Auto-generated method stub
        int Result = o1.getRegion().compareTo(o1.getRegion());

        return Result;
    }

}
