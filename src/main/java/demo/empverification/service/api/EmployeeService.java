package demo.empverification.service.api;


import demo.empverification.models.domain.Employee;

public interface EmployeeService
{
    //public String  createEmployee(Employee employee);

    public Employee  findEmployee(Long employeeId);

}
