 import java.io.*; 
      class Employee 
        { 
            int code,salary,year; 
            String WorkerName; 
            void SetData() 
            throws IOException 
              { 
                  BufferedReader bf=new BufferedReader(new InputStreamReader(System.in)); 
                  String s; 
                  System.out.println("Enter Employee Code :"); 
                  s=bf.readLine(); 
                  System.out.println("Enter Employee Year of joining :"); 
                  a=bf.readLine(); 
                  code=Integer.parseInt(s); 
                  System.out.println("Enter Name of Employee :"); 
                  WorkerName=bf.readLine(); 
                  System.out.println("Enter Basic Salary "); 
                  s=bf.readLine(); 
                  salary=Integer.parseInt(s); 
              } 
                 void ShowDetail() 
                 { 
                    System.out.println("Code :"+ code); 
                    System.out.println("Name : "+WorkerName); 
                    System.out.println("Year of Joining :"+year); 
                    System.out.println("Salary :"+salary); 
                 } 
       } 
                class EmployeesArrayofObjects 
                   { 
                       public static void main(String args[]) 
                          { 
                             int i; 
                               try 
                                 { 
                                     WorkerDetail Worker[]=new WorkerDetail[3]; 
                                     System.out.println("Enter the Details of three Workers"); 
                                     for(i=0;i<=2;i++) 
                                         { 
                                             Worker[i]=new WorkerDetail(); 
                                             Worker[i].SetData(); 
                                         } 
                                            System.out.println("The details of three Worker are :"); 
                                            for(i=0;i<=2;i++) 
                                                 { 
                                                     Worker[i].ShowDetail(); 
                                                  } 
                                 } 
                                         catch(IOException e) 
                                            { 
                                             } 
                          } 
                  }; 
