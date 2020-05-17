import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class BankRecords extends Client {

      private String[] id;
      private int[] age;
      private Sex[] sex;
      private Region[] region;
      private double[] income;
      private boolean[] isMarried;
      private int[] children;
      private boolean[] hasCar;
      private boolean[] saveAccount;
      private boolean[] currentAccount;
      private boolean[] mortgage;
      private boolean[] pep;
      private ArrayList<String> input;

      public void readData() {
            File file = new File("bank-Detail.csv");
            input = new ArrayList<String>();
            try {
                  Scanner scanner = new Scanner(file);
                  while (scanner.hasNext()) {
                        String row = scanner.nextLine();
                        input.add(row);
                  }
            } catch (FileNotFoundException e) {
                  System.out.println("Input file not found");
            }
      }

      public void processData() {
            if (input != null) {
                  if (input.size() > 0) {
                        int n = input.size();
                        id = new String[n];
                        age = new int[n];
                        sex = new Sex[n];
                        region = new Region[n];
                        income = new double[n];
                        children = new int[n];
                        hasCar = new boolean[n];
                        isMarried=new boolean[n];
                        saveAccount = new boolean[n];
                        currentAccount = new boolean[n];
                        mortgage = new boolean[n];
                        pep = new boolean[n];
                        for (int i = 0; i < n; i++) {
                              String row = input.get(i);
                              String[] fields = row.split(",");
                              id[i] = fields[0].trim();
                              age[i] = Integer.parseInt(fields[1].trim());
                              if (fields[2].trim().equalsIgnoreCase("FEMALE")) {
                                    sex[i] = Sex.FEMALE;
                              } else {
                                    sex[i] = Sex.MALE;
                              }
                              String reg = fields[3].trim();
                              if (reg.equalsIgnoreCase("INNER_CITY")) {
                                    region[i] = Region.INNER_CITY;
                              } else if (reg.equalsIgnoreCase("TOWN")) {
                                    region[i] = Region.TOWN;
                              } else if (reg.equalsIgnoreCase("RURAL")) {
                                    region[i] = Region.RURAL;
                              } else {
                                    region[i] = Region.SUBURBAN;
                              }
                              income[i] = Double.parseDouble(fields[4].trim());
                              if (fields[5].trim().equalsIgnoreCase("YES")) {
                                    isMarried[i] = true;
                              } else {
                                    isMarried[i] = false;
                              }
                              children[i] = Integer.parseInt(fields[6]);
                              if (fields[7].trim().equalsIgnoreCase("YES")) {
                                    hasCar[i] = true;
                              } else {
                                    hasCar[i] = false;
                              }
                              if (fields[8].trim().equalsIgnoreCase("YES")) {
                                   saveAccount[i] = true;
                              } else {
                                    saveAccount[i] = false;
                              }
                              if (fields[9].trim().equalsIgnoreCase("YES")) {
                                    currentAccount[i] = true;
                              } else {
                                    currentAccount[i] = false;
                              }
                              if (fields[10].trim().equalsIgnoreCase("YES")) {
                                    mortgage[i] = true;
                              } else {
                                    mortgage[i] = false;
                              }
                              if (fields[11].trim().equalsIgnoreCase("YES")) {
                                    pep[i] = true;
                              } else {
                                    pep[i] = false;
                              }
                        }

                  }

            }

      }
      public void printData() {

            System.out.printf("%10s %10s %10s %15s %10s %10s\n", "ID", "AGE", "SEX",

                        "REGION", "INCOME", "MORTGAGE");
            
            System.out.print("-------------------------------------------------------------------------------------\n");


            int n = id.length;

            if (n > 50) {

                  n = 50;

            }

            for(int i=0;i<n;i++){

                  System.out.printf("%10s %10d %10s %15s %10.2f %10s\n", getId()[i], getAge()[i], getSex()[i],

                              getRegion()[i], getIncome()[i], getMortgage()[i]);

            }
            System.out.print("-------------------------------------------------------------------------------------\n");
            System.out.print(" Bank of IIT ITMD 411 \n "
            		+ "Mahmood Mehrjoo");
      }
     

      public static void main(String[] args) {


          BankRecords records = new BankRecords();

          records.readData();

          records.processData();

          records.printData();

    }
   

      public String[] getId() {

            return id;

      }

      public void setId(String[] id) {

            this.id = id;

      }

      public int[] getAge() {

            return age;

      }

      public void setAge(int[] age) {

            this.age = age;

      }

      public Sex[] getSex() {

            return sex;

      }

      public void setSex(Sex[] sex) {

            this.sex = sex;

      }

      public Region[] getRegion() {

            return region;

      }

      public void setRegion(Region[] region) {

            this.region = region;

      }

      public double[] getIncome() {

            return income;

      }

      public void setIncome(double[] income) {

            this.income = income;

      }

      public boolean[] getIsMarried() {

            return isMarried;

      }

      public void setIsMarried(boolean[] isMarried) {

            this.isMarried = isMarried;

      }

      public int[] getChildren() {

            return children;

      }

      public void setChildren(int[] children) {

            this.children = children;

      }

      public boolean[] getHasCar() {

            return hasCar;

      }

      public void setHasCar(boolean[] hasCar) {

            this.hasCar = hasCar;

      }

      public boolean[] getSaveAccount() {

            return saveAccount;

      }

      public void setSaveAccount(boolean[] saveAccount) {

            this.saveAccount = saveAccount;

      }

      public boolean[] getCurrentAccount() {

            return currentAccount;

      }

      public void setCurrentAccount(boolean[] currentAccount) {

            this.currentAccount = currentAccount;

      }

      public boolean[] getMortgage() {

            return mortgage;

      }

      public void setMortgage(boolean[] mortgage) {

            this.mortgage = mortgage;

      }

      public boolean[] getPep() {

            return pep;

      }

      public void setPep(boolean[] pep) {

            this.pep = pep;

      }

      public ArrayList<String> getInput() {

            return input;

      }

      public void setInput(ArrayList<String> input) {

            this.input = input;

      }

}

enum Sex {

      MALE, FEMALE

}


enum Region {

      INNER_CITY, TOWN, RURAL, SUBURBAN

}

