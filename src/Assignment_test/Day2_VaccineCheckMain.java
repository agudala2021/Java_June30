package Assignment_test;

import java.util.ArrayList;
import java.util.List;

public class Day2_VaccineCheckMain {

//    public static int Vcn_Count = 0;
//    public static int NVcn_Count = 0;

    public static void main(String[] args) {

        List<Emp_Details> EmpList = new ArrayList<>();
        Emp_Details emp1 = new Emp_Details("Tom","Flaherty","10001","100000","Nashua","Birchill","NH","Architect","Y");
        Emp_Details emp2 = new Emp_Details("Jim","Shally","10002","102000","Sharon","Collab","MA","PMO","Y");
        Emp_Details emp3 = new Emp_Details("Doug","Feldman","10003","10500","Austin","Centro","TX","VP","N");
        Emp_Details emp4 = new Emp_Details("KP","PRao","10004","10600","Altanta","Avaya","GA","Informatica","N");
        Emp_Details emp5 = new Emp_Details("Rob","F","10008","10607","York","Takeda","NH","SA","Y");


        EmpList.add(emp1);
        EmpList.add(emp2);
        EmpList.add(emp3);
        EmpList.add(emp4);
        EmpList.add(emp5);


        EmpVaccineStatus empVaccineStatus = new EmpVaccineStatus();
        empVaccineStatus.getEmpVaccineStatus(EmpList);

    }




}
