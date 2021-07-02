package Assignment_test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmpAssetRelated {

    public int getUniqueHomeAddressCityCount(List<Emp_Details> Emp_List) {
        Set<String> uniqueHomeAddress = new HashSet<>();
        for (Emp_Details e : Emp_List) {
            System.out.println(e.getHomeAddress());
            uniqueHomeAddress.add(e.getHomeAddress());
        }
        return uniqueHomeAddress.size();
    }

}
