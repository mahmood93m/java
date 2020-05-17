package lab3;

import java.util.Comparator;


public class IncomeComparator implements Comparator<BankRecords>{

    @Override
    public int compare(BankRecords o1, BankRecords o2) {
        // TODO Auto-generated method stub
        int Result = String.valueOf(o1.getIncome()).compareTo(String.valueOf(o2.getIncome()));
        return Result;
    }

}