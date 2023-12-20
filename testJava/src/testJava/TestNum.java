package testJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestNum {

	public static void main(String[] args) {
		
		
		List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
  
		// Find out the count of male and female employees present in the organization?
        System.out.println("Find out the count of male and female employees present in the organization?");
        Map<String , Long> mapemployee = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		
        for(Map.Entry entry : mapemployee.entrySet())
        {
        	System.out.println("Gender......."+entry.getKey());
        	System.out.println("Total Count......."+entry.getValue());
        }
		// Write a program to print the names of all departments in the organization.
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
        
        //Find the average age of Male and Female Employees.
        Map<String , Double> mapemployee_age = employeeList.stream()
        		.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        for(Map.Entry entry : mapemployee_age.entrySet())
        {
        	System.out.println("Gender......."+entry.getKey());
        	System.out.println("Average Age......."+entry.getValue());
        }
        
        //Get the Names of employees who joined after 2015.
        System.out.println("Get the Names of employees who joined after 2015.");
        employeeList.stream().filter(emp->emp.getYearOfJoining()>2005).map(Employee::getName).forEach(System.out::println);

       // Count the number of employees in each department.
        System.out.println("-----------------------------------------------");
        System.out.println("Count the number of employees in each department.");
        Map<String , Long> mapemployee_dept =employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));	
        for(Map.Entry entry : mapemployee_dept.entrySet())
        {
        	System.out.println("Department......."+entry.getKey());
        	System.out.println("Count......."+entry.getValue());
        }
        System.out.println("-----------------------------------------------");
        System.out.println(" Find out the average salary of each department.");
        Map<String , Double> mapemployee_dept1 =employeeList.stream()
        		.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));	
        for(Map.Entry entry : mapemployee_dept1.entrySet())
        {
        	System.out.println("Department......."+entry.getKey());
        	System.out.println("Average Salary......."+entry.getValue());
        }
        
        //7. Find out the oldest employee, his/her age and department?
        System.out.println(" Find out the oldest employee, his/her age and department?");
        Optional<Employee> empOpt = employeeList.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).findFirst();
        
       System.out.println("Employee Name........."+empOpt.get().getName());
       
       
       //Find out the average and total salary of the organization.
       DoubleSummaryStatistics dss = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
       System.out.println("Average Salary........."+ dss.getAverage());
       System.out.println("Total Salary........."+ dss.getSum());
       
       //9. List down the employees of each department.
      Map<String, List<Employee>> mapEmp = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
      for(Map.Entry entry : mapEmp.entrySet())
      {
      	System.out.println("Department......."+entry.getKey());
      	List<Employee> e = (List)entry.getValue();
      	for(Employee e1 : e)
      	{
      		System.out.println("Name......."+e1.getName());
      		System.out.println("Age......."+e1.getAge());
      	}
      } 
      
       //10. Find out the highest experienced employees in the organization
      
      System.out.println("Find out the highest experienced employees in the organization");
     Employee oemp = employeeList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining)).get();
      System.out.println("Name............."+oemp.getName());
      
      System.out.println("Find out the List whose  employees salary > 5000 in the organization");
     Map<Boolean,List<Employee>> mapEmpSal= employeeList.stream().collect(Collectors.partitioningBy(e->e.getSalary()>15000));
     for(Map.Entry entry : mapEmpSal.entrySet())
     {
     	System.out.println("Boolean......."+entry.getKey());
     	List<Employee> e = (List)entry.getValue();
     	for(Employee e1 : e)
     	{
     		System.out.println("Name......."+e1.getName());
     		System.out.println("Age......."+e1.getSalary());
     	}
     }
     
     
    Map<String , Map<Integer,Double>> mapgroup = employeeList.stream().collect(
    		 Collectors.groupingBy(Employee::getDepartment,Collectors.groupingBy
    				 										(Employee::getAge
    				 									     ,Collectors.summingDouble(Employee::getSalary)))
    		 						);
    for(Map.Entry entry : mapgroup.entrySet())
    {
    	System.out.println("Department......."+entry.getKey());
    	Map<Integer,Double> temp = (Map)entry.getValue();
    	for(Map.Entry entry1 : temp.entrySet())
        {
    		System.out.println("Age......."+entry1.getKey());
    		System.out.println("Department Wise Salary......."+entry1.getValue());
        }
        
    } 
    
   List<EmployeeN> emp = employeeList.stream().map(e->new EmployeeN(e.getAge())).toList();
   

  // List<EmployeeN> emp = employeeList.stream().map(EmployeeN::new).toList();
		   //collect(Collectors.toList());
      
     
     
     
	}

}
