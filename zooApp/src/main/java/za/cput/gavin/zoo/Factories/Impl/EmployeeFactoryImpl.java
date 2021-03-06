package za.cput.gavin.zoo.Factories.Impl;

import za.cput.gavin.zoo.Domain.Employee;
import za.cput.gavin.zoo.Factories.EmployeeFactory;

import java.sql.Date;

/**
 * Created by gavin.ackerman on 2016-04-05.
 */
public class EmployeeFactoryImpl implements EmployeeFactory{
    private static EmployeeFactoryImpl factory = null;

    private EmployeeFactoryImpl(){

    }

    public static EmployeeFactoryImpl getInstance(){
        if (factory == null)
            factory = new EmployeeFactoryImpl();

        return factory;
    }
    public  Employee createEmployee(Long id,String name, String surname, int age,String Country)
    {
        Employee employee = new Employee.Builder(id).name(name).surname(surname).age(age).Country(Country)
                .build();

        return employee;
    }
}
