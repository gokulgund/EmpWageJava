public class EmployeeWageUC5

{
 //constant
    public static final int IS_FULL_TIME=1;
    public static final int SALARY_PERHR=20;
    public static final int IS_PART_TIME=2;
    public static final int NO_OF_DAYS=20;


   public static void main(String[] args)
{
    //Variable
    int Working_Hr=0;
     int empwage=0;
    int Totalempwage=0;
          for (int  day=0;day<NO_OF_DAYS;day++)
         {
             int empCheck=(int)Math.floor((Math.random() * 10) % 3);

            switch(empCheck)
                 {
                   case IS_FULL_TIME:   Working_Hr=8;
                    break;
                   case IS_PART_TIME:
                             Working_Hr=4;
                   break;
                  default:
                      Working_Hr=0;
                 }
              empwage=Working_Hr*SALARY_PERHR;
                Totalempwage +=empwage;
                    System.out.println("Emp Wage :  " + empwage);
         }

                  System.out.println("Total Emp Wage : " +Totalempwage);
}


}
