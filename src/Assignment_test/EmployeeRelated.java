package Assignment_test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeRelated {
    public void isVaccinated(List<Emp_Details> Emp_List) {
        int Vcn_Count = 0; int NVcn_Count = 0;

        for ( Emp_Details  nm: Emp_List ) {
            if (nm.getVaccine_status().equalsIgnoreCase("Y")) {
                Vcn_Count++;
            } else  {
                NVcn_Count++;
            }
        }
        System.out.println("Number of Employees Vaccinated:"+Vcn_Count);
        System.out.println("Number of Employees Not Vaccinated:"+NVcn_Count);

    }

    public int getUniqueHomeAddressCityCount(List<Emp_Details> Emp_List) {
        Set<String> uniqueHomeAddress = new HashSet<>();
        for (Emp_Details e : Emp_List) {
            System.out.println(e.getHomeAddress());
            uniqueHomeAddress.add(e.getHomeAddress());
        }
        return uniqueHomeAddress.size();
    }

    public Map<String, String> getSalaryDetail(List<Emp_Details> Emp_List) {
        Map<String, String> salaryDetail = new HashMap<>();
        for (Emp_Details e : Emp_List) {
            if (e.getSalary() >= 5000) {
                salaryDetail.put(e.getEmp_no(), e.getFirstName() + " " + e.getLastName() + " has a salary " + e.getSalary());
            }
        }
        return salaryDetail;
    }

//    public Map<String, Emp_Details> getSalaryDetail2(List<Emp_Details> Emp_List) {
//
//        Map<String, Emp_Details> salaryDetail = new HashMap<>();
//        for (Emp_Details e : Emp_List) {
//            if (e.getSalary() >= 5000) {
//                salaryDetail.put(e.getEmp_no(),e);
//            }
//        }
//        return salaryDetail;
//    }

    public Map<String, Integer> getSalaryDetail2(List<Emp_Details> Emp_List) {
        Map<String, Integer> salaryDetail = new HashMap<>();
        try {
            salaryDetail.put(Emp_List.get(0).getEmp_no(), Emp_List.get(0).getSalary() + 100);
        }
        catch(Exception e){
            System.out.println("we should not try to access elements of an empty list");
//            throw new ArithmeticException("Salary cannot be NULL");
        }
        return salaryDetail;
    }
}