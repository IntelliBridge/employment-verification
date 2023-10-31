package demo.empverification.service.impl;

import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import demo.empverification.repository.EmployeeRepository;
import demo.empverification.models.domain.Employee;
import demo.empverification.service.api.EmployeeService;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmployeeServiceImpl implements EmployeeService
{

    private final EmployeeRepository employeeRepository;

    @Override
    public String createEmployee(Employee employee)
    {

         employee  = employeeRepository.saveAndFlush(employee);
        return "success";
    }


}

