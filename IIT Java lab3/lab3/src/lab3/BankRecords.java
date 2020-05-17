package lab3;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankRecords extends Client{

    static BankRecords rObjs[];
    List<List<String>> array = new ArrayList<List<String>>();

    //declaring variables
    String id;
    int age;
    String sex;
    String region;
    double income;
    String married;
    int children;
    String car;
    String save_act;
    String current_act;
    String mortage;
    String pep;

    //This method reads all the data from the given excel file and check any errors

    void readData()
    {
        String Line = "";

        try(BufferedReader br = new BufferedReader (new FileReader("bank-Detail.csv")))
        {
            int i = 0;
            while((Line = br.readLine()) != null) //till end of the file
            {
                array.add(Arrays.asList(Line.split(",")));
                //System.out.println(array.get(i++));
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        processData(); //calling a method
    }

    //getters and setters for all the variables
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getSave_act() {
        return save_act;
    }

    public void setSave_act(String save_act) {
        this.save_act = save_act;
    }

    public String getCurrent_act() {
        return current_act;
    }

    public void setCurrent_act(String current_act) {
        this.current_act = current_act;
    }

    public String getMortage() {
        return mortage;
    }

    public void setMortage(String mortage) {
        this.mortage = mortage;
    }

    public String getPep() {
        return pep;
    }

    public void setPep(String pep) {
        this.pep = pep;
    }

     //This method processes all the read data and store each piece into string spaced by ','

    void processData()
    {
        int i = 0;

        rObjs = new BankRecords[array.size()];
        for(List<String> row: array)
        {
            rObjs[i] = new BankRecords();

            rObjs[i].setId(row.get(0)); //storing ID
            rObjs[i].setAge(Integer.parseInt(row.get(1))); //storing Age
            rObjs[i].setSex(row.get(2)); //storing Sex
            rObjs[i].setRegion(row.get(3)); //storing Region
            rObjs[i].setIncome(Double.parseDouble(row.get(4))); //storing Income
            rObjs[i].setMarried(row.get(5)); //storing Married
            rObjs[i].setChildren(Integer.parseInt(row.get(6))); //storing Children
            rObjs[i].setCar(row.get(7)); //storing Car
            rObjs[i].setSave_act(row.get(8)); //storing save_act
            rObjs[i].setCurrent_act(row.get(9)); //storing current_act
            rObjs[i].setMortage(row.get(10)); //storing Mortgage
            rObjs[i].setPep(row.get(11)); //storing pep
            i++;
        }
        //printData();
    }

    //printData() method prints all the data in a format

    void printData()
    {
        System.out.println("ID\t\tAge\t\tSex\t\tRegion\t\tIncome\t\tMortgage" );
        for (int i=0; i<=24; i++)
        {
       /*System.out.println(rObjs[i].getId() + "\t\t" + rObjs[i].getAge() + "\t\t" + rObjs[i].getSex() + "\t\t" +
       rObjs[i].getRegion() +"\t\t" + rObjs[i].getIncome() + "\t\t" +rObjs[i].getMarried() + "\t\t" + rObjs[i].getChildren() +
       "\t\t" + rObjs[i].getCar() + "\t\t" +rObjs[i].getSave_act() + "\t\t" + rObjs[i].getCurrent_act() + "\t\t" +
       rObjs[i].getMortage() + "\t\t" + rObjs[i].getPep() );*/


            String Final = String.format( "%s\t\t%s\t\t%s\t\t%-10s\t%8.2f\t%s",rObjs[i].getId(),rObjs[i].getAge(),rObjs[i].getSex(),
                    rObjs[i].getRegion(),rObjs[i].getIncome(), rObjs[i].getMortage());
            System.out.println(Final);
        }
    }

    public static void main(String[] args) throws IOException
    {
        BankRecords sc = new BankRecords();
        sc.readData();
    }
}