package Assignment_test;
import java.util.List;

public class EmpVaccineStatus {
    public void getEmpVaccineStatus(List<Emp_Details> EmpList) {
        int Vcn_Count = 0;
        int NVcn_Count = 0;
        for ( Emp_Details  nm: EmpList ) {
            if (nm.getVaccine_status().equalsIgnoreCase("Y")) {
                        Vcn_Count++;
                    } else  {
                        NVcn_Count++;
                    }
        }
        System.out.println("Number of Employees Vaccinated:"+Vcn_Count);
        System.out.println("Number of Employees Not Vaccinated:"+NVcn_Count);

    }

}
