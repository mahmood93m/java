package lab3;
import java.util.Comparator;


public class MaleComparator implements Comparator<BankRecords> {

    @Override
    public int compare(BankRecords o1, BankRecords o2) {
        // TODO Auto-generated method stub
        int Result = o1.getSex().compareTo(o2.getSex());
        if(Result != 0)
        {
            return Result;
        }
        return o1.getCar().compareTo(o2.getCar());
    }

}
