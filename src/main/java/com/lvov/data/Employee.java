package com.lvov.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Employee implements Serializable{
    @Id
    private int EmployeeId;
    private String FirstName;
    private String LastName;

    public int getEmployeeId()
    {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId)
    {
        EmployeeId = employeeId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    
    public void setLastName(String lastname){
        LastName = lastname;
    }
}
