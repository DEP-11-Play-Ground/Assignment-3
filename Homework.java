import java.io.ObjectInputFilter.Status;
import java.util.Scanner;

public class Homework {

    private static final Scanner scanner = new Scanner(System.in);
    public  static void main(String args []){

       final String GREEN = "\033[32;1m";
       final String RED   = "\033[31;1m";
       final String BLUE  = "\033[36;1m";
       final String YELLOW  = "\033[33;1m";
       final String RESET = "\033[30;0m";

      System.out.print("Enter your Name: ");
      String name = scanner.nextLine();

      if(name.length()>0 && name.strip().length()>0){
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if(10 <= age && age <= 18){

             Scanner scanner = new Scanner(System.in);
             System.out.print("Enter your Subject: ");
             String subject1 = scanner.nextLine();
             //System.out.println(subject1);
             boolean flag1 = subject1.startsWith("SE-");

            if(flag1 == true ){
                System.out.print("Enter your subject1 marks: " );
                 Double subMark1 = scanner.nextDouble();
                  
                if (0 < subMark1 && subMark1 <= 100){
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.print("Enter your subject2: ");
                    String subject2 = scanner1.nextLine();

                    boolean flag2 = subject2.startsWith("SE-");
                    boolean result2 = (subject2.equals(subject1));

                    if(flag2 == true && result2 == false){

                        System.out.print("Enter your subject2 marks: " );
                        Double subMark2 = scanner.nextDouble();

                        if(0 <= subMark2 && subMark2 <= 100){

                            System.out.print("Enter your subject3: ");
                            String subject3 = scanner1.nextLine();

                            boolean flag3 = subject3.startsWith("SE-");
                            boolean result3 = (subject3.equals(subject1));
                            boolean result4 = (subject3.equals(subject1));
                         
                            if(flag3 == true && result3 == false && result4 == false){

                                System.out.print("Enter your subject3 marks: " );
                                Double subMark3 = scanner.nextDouble();
                                
                                if(0 < subMark3 && subMark3 <= 100){

                                    Double total = subMark1 + subMark2 + subMark3;
                                    Double avg = total/3;
                                    String status = (75<=avg) ? "Distinguished Pass" : (65 <= avg) ? "Credit Pass" : (55 <= avg) ? "pass" : "Fail";
                                    String statusSub1 = (75<=subMark1) ? "Distinguished Pass" : (65 <= subMark1) ? "Credit Pass" : (55 <= subMark1) ? "Pass" : "Fail";
                                    String statusSub2 = (75<=subMark2) ? "Distinguished Pass" : (65 <= subMark2) ? "Credit Pass" : (55 <= subMark2) ? "Pass" : "Fail";
                                    String statusSub3 = (75<=subMark3) ? "Distinguished Pass" : (65 <= subMark3) ? "Credit Pass" : (55 <= subMark3) ? "Pass" : "Fail";

                                  
                                  
                                    if(status.length()>12 || statusSub1.length()>12 || statusSub2.length() >12 || statusSub3.length() >12 ){

                                    System.out.printf("+---------------+----------+--------------------+\n");
                                    System.out.printf("|Name:   %s%s%s\t\t\t\t|\n",  BLUE, name.toUpperCase(), RESET );
                                    System.out.printf("|Age:    %s%s%s %syears old%s                   \t|\n", RED, age, RESET, BLUE, RESET);
                                    if(status.length()>12){System.out.printf("|Status: %s%s%s\t\t\t|\n", (status.equals("Distinguished Pass"))? BLUE : (status.equals("Credit Pass"))? GREEN : (status.equals("Pass"))? YELLOW : RED, status, RESET);}else{
                                                           System.out.printf("|Status: %s%s%s\t\t\t\t|\n", (status.equals("Distinguished Pass"))? BLUE : (status.equals("Credit Pass"))? GREEN : (status.equals("Pass"))? YELLOW : RED, status, RESET);
                                    }
                                    System.out.printf("|Total:  %.2f        Avg:  %.2f\t\t|\n", total, avg);
                                    System.out.printf("+---------------+----------+--------------------+\n");
                                    System.out.printf("|     Subject   |   Marks  |   Satus    \t|\n");
                                    System.out.printf("+---------------+----------+--------------------+\n");
                                   
                                   
                                    if(statusSub1.length()>12){System.out.printf("|     %s%s00%s%s\t|   %s%.2f%s  |%s%s%s\t|\n", RED, subject1.substring(0,3), subject1.substring(3),RESET, RED, subMark1, RESET, (statusSub1.equals("Distinguished Pass"))? BLUE :(statusSub1.equals("Credit Pass"))? GREEN : (statusSub1.equals("Pass"))? YELLOW : RED, statusSub1, RESET); }else{
                                                               System.out.printf("|     %s%s00%s%s\t|   %s%.2f%s  |%s%s%s\t\t|\n", RED, subject1.substring(0,3), subject1.substring(3),RESET, RED, subMark1, RESET, (statusSub1.equals("Distinguished Pass"))? BLUE :(statusSub1.equals("Credit Pass"))? GREEN : (statusSub1.equals("Pass"))? YELLOW : RED, statusSub1, RESET);
                                    } 
                                    if(statusSub2.length()>12){System.out.printf("|     %s%s00%s%s\t|   %s%.2f%s  |%s%s%s\t|\n", RED, subject2.substring(0,3), subject2.substring(3),RESET, RED, subMark2, RESET, (statusSub2.equals("Distinguished Pass"))? BLUE :(statusSub2.equals("Credit Pass"))? GREEN : (statusSub2.equals("Pass"))? YELLOW : RED, statusSub2, RESET);}else{
                                                               System.out.printf("|     %s%s00%s%s\t|   %s%.2f%s  |%s%s%s\t\t|\n", RED, subject2.substring(0,3), subject2.substring(3),RESET, RED, subMark2, RESET, (statusSub2.equals("Distinguished Pass"))? BLUE :(statusSub2.equals("Credit Pass"))? GREEN : (statusSub2.equals("Pass"))? YELLOW : RED, statusSub2, RESET);
                                    }
                                    if(statusSub3.length()>12){System.out.printf("|     %s%s00%s%s\t|   %s%.2f%s  |%s%s%s\t|\n", RED, subject3.substring(0,3), subject3.substring(3),RESET, RED, subMark3, RESET, (statusSub3.equals("Distinguished Pass"))? BLUE :(statusSub3.equals("Credit Pass"))? GREEN : (statusSub3.equals("Pass"))? YELLOW : RED, statusSub3, RESET);}else{
                                                               System.out.printf("|     %s%s00%s%s\t|   %s%.2f%s  |%s%s%s\t\t|\n", RED, subject3.substring(0,3), subject3.substring(3),RESET, RED, subMark3, RESET, (statusSub3.equals("Distinguished Pass"))? BLUE :(statusSub3.equals("Credit Pass"))? GREEN : (statusSub3.equals("Pass"))? YELLOW : RED, statusSub3, RESET);
                                    }
                                    
                                    System.out.printf("+---------------+----------+--------------------+\n");

                                    }else{
                                     System.out.printf("+---------------------------------------+\n");
                                     System.out.printf("|Name:   %s%s%s\t\t\t|\n",  BLUE, name.toUpperCase(), RESET );
                                    System.out.printf("|Age:    %s%s%s %syears old%s                   |\n", RED, age, RESET, BLUE, RESET);
                                    System.out.printf("|Status: %s%s%s\t\t\t|\n", (status.equals("Distinguished Pass"))? BLUE : (status.equals("Credit Pass"))? GREEN : (status.equals("Pass"))? YELLOW : RED, status, RESET);
                                    System.out.printf("|Total:  %.2f        Avg:  %.2f\t|\n", total, avg);
                                    System.out.printf("+---------------+----------+------------+\n");
                                    System.out.printf("|     Subject   |   Marks  |   Satus    |\n");
                                    System.out.printf("+---------------+----------+------------+\n");
                                   
                                    System.out.printf("|     %s%s00%s%s\t|   %s%.2f%s  |%s%s%s\t|\n", RED, subject1.substring(0,3), subject1.substring(3),RESET, RED, subMark1, RESET, (statusSub1.equals("Distinguished Pass"))? BLUE :(statusSub1.equals("Credit Pass"))? GREEN : (statusSub1.equals("Pass"))? YELLOW : RED, statusSub1, RESET);
                                    System.out.printf("|     %s%s00%s%s\t|   %s%.2f%s  |%s%s%s\t|\n", RED, subject2.substring(0,3), subject2.substring(3),RESET, RED, subMark2, RESET, (statusSub2.equals("Distinguished Pass"))? BLUE :(statusSub2.equals("Credit Pass"))? GREEN : (statusSub2.equals("Pass"))? YELLOW : RED, statusSub2, RESET);
                                    System.out.printf("|     %s%s00%s%s\t|   %s%.2f%s  |%s%s%s\t|\n", RED, subject3.substring(0,3), subject3.substring(3),RESET, RED, subMark3, RESET, (statusSub3.equals("Distinguished Pass"))? BLUE :(statusSub3.equals("Credit Pass"))? GREEN : (statusSub3.equals("Pass"))? YELLOW : RED, statusSub3, RESET);
                                    
                                    System.out.printf("+---------------+----------+------------+\n");
                                    }
                                    
                                    



                                }else{System.out.printf("%sInvalid marks%s\n", RED, RESET);}


                            }else{System.out.printf("%sInvalid subject%s\n", RED, RESET);}

                        }else{
                            System.out.printf("%sInvalid marks%s\n", RED ,RESET);
                        }

                    }else{System.out.printf("%sInvalid subject%s\n", RED, RESET);}

                }else{
                    System.out.printf("%sInvalid subject marks%s\n",RED, RESET);
                }

            }else{
                System.out.printf("%sInvalid subject%s\n", RED, RESET);}
            

        }else{System.out.printf("%sInvalid age%s\n", RED, RESET);}


      }else{System.out.printf("%sInvalid Name%s \n", RED, RESET);}



    }
}
