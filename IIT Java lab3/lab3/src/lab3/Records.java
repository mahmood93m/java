package lab3;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class Records extends BankRecords{

    private static FileWriter fw = null;

    public Records()
    {
        try
        {
            fw = new FileWriter("bankrecords.txt"); //creating new text file
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }


    //This method sorts Sex and Mortgage and then count the number of females with Mortgage

    private static void femaleComparator()
    {
        Arrays.sort(rObjs, new FemaleComparator()); //sorting defined objects
        int FemaleCount = 0;
        for(int i=0; i < rObjs.length; i++)
        {
            if(rObjs[i].getSex().equals("FEMALE") && rObjs[i].getMortage().equals("YES")) //getting females with mortgage
                FemaleCount++;
        }
        System.out.println("Number of Females with Mortage & Saving acct: " + FemaleCount);
        try
        {
        	System.out.println("===============================================");
            fw.write("Number of Females with Mortage & Saving acct : " + FemaleCount);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

     //maleComparator method count the number of males with car and 1 children per location

    private static void maleComparator()
    {
        Arrays.sort(rObjs, new MaleComparator()); //sorting defined objects
        int MaleCountInner = 0, MaleCountTown = 0, MaleCountRural = 0, MaleCountSuburbun = 0; //initializing to 0
        for(int i=0; i < rObjs.length; i++)
        {
            if(rObjs[i].getSex().equals("MALE") && rObjs[i].getRegion().equals("INNER_CITY")&& rObjs[i].getCar().equals("YES") && rObjs[i].getChildren() == 1)
                MaleCountInner++;
        }
        System.out.println("Innercity region males with car & 1 child: "+ MaleCountInner);

        
        for(int i=0; i < rObjs.length; i++)
        {
            if(rObjs[i].getSex().equals("MALE") && rObjs[i].getRegion().equals("RURAL")&& rObjs[i].getCar().equals("YES") && rObjs[i].getChildren() == 1)
                MaleCountRural++;
        }
        System.out.println("Rural region males with car & 1 child: " + MaleCountRural);
        

        for(int i =0; i < rObjs.length; i++)
        {
            if(rObjs[i].getSex().equals("MALE") && rObjs[i].getRegion().equals("SUBURBAN")&& rObjs[i].getCar().equals("YES") && rObjs[i].getChildren() == 1)
                MaleCountSuburbun++;
        }
        System.out.println("Suburban region males with car & 1 child: " + MaleCountSuburbun);

        
        for(int i=0; i < rObjs.length; i++)
        {
            if(rObjs[i].getSex().equals("MALE") && rObjs[i].getRegion().equals("TOWN")&& rObjs[i].getCar().equals("YES") && rObjs[i].getChildren() == 1)
                MaleCountTown++;
        }
        System.out.println("TOWN region males with car & 1 child: " + MaleCountTown);
        
        
        try
        {
            fw.write("\nInnercity region males with car & 1 child: "+ MaleCountInner + "\n" + "TOWN region males with car & 1 child: " + MaleCountTown + "\n" + "Rural region males with car & 1 child: " + MaleCountRural + "\nSuburban region males with car & 1 child: " + MaleCountSuburbun + "\n\n" );
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

      //This methods counts maximum and minimum age per location

    private static void regionAgeComparator()
    {
        Arrays.sort(rObjs, new LocationComparator());
        int InnerCityMaxAge=0, TownMaxAge=0, RuralMaxAge=0, SuburbunMaxAge =0; //initializing to 0

        for(int i = 0; i < rObjs.length; i++)
        {
            if(rObjs[i].getRegion().equals("INNER_CITY") && rObjs[i].getAge() > InnerCityMaxAge)
                InnerCityMaxAge = rObjs[i].getAge();
        }

        for(int i=0; i < rObjs.length; i++)
        {
            if(rObjs[i].getRegion().equals("TOWN") && rObjs[i].getAge() > TownMaxAge)
                TownMaxAge = rObjs[i].getAge();
        }

        for (int i=0; i<rObjs.length; i++)
        {
            if(rObjs[i].getRegion().equals("RURAL") && rObjs[i].getAge() > RuralMaxAge)
                RuralMaxAge = rObjs[i].getAge();
        }

        for(int i=0; i<rObjs.length; i++)
        {
            if(rObjs[i].getRegion().equals("SUBURBAN") && rObjs[i].getAge() > SuburbunMaxAge)
                SuburbunMaxAge = rObjs[i].getAge();
        }

        //System.out.println("Max Age per region: \nINNER_CITY : " + InnerCityMaxAge + "\nTown : " + TownMaxAge + "\nRural : " + RuralMaxAge + "\nSuburban : " + SuburbunMaxAge);

        Arrays.sort(rObjs, new LocationComparator());
        //setting min age to max age as a reference to use
        int InnerCityMinAge=InnerCityMaxAge, TownMinAge=TownMaxAge, RuralMinAge=RuralMaxAge, SuburbunMinAge =SuburbunMaxAge;

        for(int i = 0; i < rObjs.length; i++)
        {
            if(rObjs[i].getRegion().equals("INNER_CITY") && rObjs[i].getAge() < InnerCityMinAge)
                InnerCityMinAge = rObjs[i].getAge();
        }

        for(int i=0; i < rObjs.length; i++)
        {
            if(rObjs[i].getRegion().equals("TOWN") && rObjs[i].getAge() < TownMinAge)
                TownMinAge = rObjs[i].getAge();
        }

        for (int i=0; i<rObjs.length; i++)
        {
            if(rObjs[i].getRegion().equals("RURAL") && rObjs[i].getAge() < RuralMinAge)
                RuralMinAge = rObjs[i].getAge();
        }

        for(int i=0; i<rObjs.length; i++)
        {
            if(rObjs[i].getRegion().equals("SUBURBAN") && rObjs[i].getAge() < SuburbunMinAge)
                SuburbunMinAge = rObjs[i].getAge();
        }
        //System.out.println("\nMin Age per region: \nINNER_CITY : " + InnerCityMinAge + "\nTown : " + TownMinAge + "\nRural : " + RuralMinAge + "\nSuburban : " + SuburbunMinAge);
        //printing all the data
        
        System.out.println("===============================================");
        System.out.println("Max and Min ages per location :\n");
        System.out.println(" \t INNER_CITY \t TOWN \t RURAL \t SUBURBUN");
        System.out.println("Maximum:\t " + InnerCityMaxAge + "\t\t " + TownMaxAge + "\t " + RuralMaxAge + "\t " + SuburbunMaxAge);
        System.out.println("Minimum:\t " + InnerCityMinAge + "\t\t " + TownMinAge + "\t " + RuralMinAge + "\t " + SuburbunMinAge);
        try
        {
            fw.write("Maximum Age per region: \nINNER_CITY : " + InnerCityMaxAge + "\nTown : " + TownMaxAge + "\nRural : " + RuralMaxAge + "\nSuburban : " + SuburbunMaxAge);
            fw.write("\nMinimum Age per region: \nINNER_CITY : " + InnerCityMinAge + "\nTown : " + TownMinAge + "\nRural : " + RuralMinAge + "\nSuburban : " + SuburbunMinAge);
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    //This method sum the income of all people and then take average of it

    public static void AvgComp()
    {
        Arrays.sort(rObjs, new SexComparator());
        
        
        
        int maleCt = 0, femCt = 0;
        double maleInc =0, femInc = 0;
     
		for (int j = 0; j < rObjs.length; j++)
			if (rObjs[j].getSex().equals("FEMALE")) {
				++femCt;
				femInc += 2*rObjs[j].getIncome();
			}  
		femInc = femInc / rObjs.length;
		 System.out.print("\nFemale Income is : " + "$" + String.format("%.7g%n", femInc));
		 
		 
		 for (int k = 0; k < rObjs.length; k++)
				if (rObjs[k].getSex().equals("MALE")) {
					++maleCt;
					maleInc += 2*rObjs[k].getIncome();
				}  
		 maleInc = maleInc / rObjs.length; 
			 System.out.print("Male Income is : " + "$" + String.format("%.7g%n", maleInc));
	        
        
        
        double AvgIncome = 0, sum = 0;
        for(int i =0; i < rObjs.length; i++)
        {
            sum += rObjs[i].getIncome();
        }
        AvgIncome = sum / rObjs.length; //average of income sum
        System.out.print("Avg Income is : " + "$" + String.format("%.7g%n", AvgIncome));
   
        try
        {
        	fw.write("Intermediate Software Development ITMD411 - LAB3\n");
        	fw.write("Data analytic results :\n\n");
        	 fw.write("Female Income is : " + "$" + String.format("%.7g%n", femInc));
        	 fw.write("Male Income is : " + "$" + String.format("%.7g%n", maleInc));
            fw.write("Avg income is : " + "$" + String.format("%.7g%n", AvgIncome) + "\n");

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException
    {
        Records obj = new Records();
        obj.readData();
        System.out.println("Intermediate Software Development ITMD411 - LAB3");
        System.out.print("Data analytic results :\n");
        AvgComp();
        System.out.print("\n===============================================\n");
        femaleComparator();
        maleComparator();
        regionAgeComparator(); 
        System.out.print("\n===============================================\n");
       
        String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println("Current Date & Time= " + timeStamp + "\nProgrammed by Mahmood.......\n");
        fw.write("\n\nCurrent Date & Time= " + timeStamp + "\nProgrammed by Mahmood.....\n");
        try{
            fw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}