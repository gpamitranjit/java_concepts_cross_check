package com.amdocs.mainApp_6;

import com.amdocs.mainApp_5.Employee;

/**
 * @author Amit
 *
 */
@FunctionalInterface
public interface EmployeeFactory {

	public abstract Employee getEmployee(String name, String accont, Integer salary);
}
