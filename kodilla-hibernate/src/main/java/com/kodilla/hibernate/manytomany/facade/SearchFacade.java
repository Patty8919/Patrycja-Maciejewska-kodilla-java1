package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchFacade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    private final static Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);

    public List<Company> processSearchCompany(String name) {
        List<Company> companies = companyDao.retrieveCompanyName(name).orElse(new ArrayList<Company>());
        if (companies.size() !=0) {
            for (Company company : companies) {
                LOGGER.info("Found company: " + company.getName() + name);
            }
        } else {
            LOGGER.error("No company with: " + name);
        }
        return companies;
    }

    public List<Employee> processSearchEmployee(String lastname) {
        List<Employee> employees = employeeDao.retrieveFromPartOfLastName(lastname).orElse(new ArrayList<Employee>());
        if (employees.size() != 0) {
            for (Employee employee : employees) {
                LOGGER.info("Found employee: " + employee.getLastname() + lastname);
            }
        } else {
            LOGGER.error("No employee found with: " + lastname);
        }
        return employees;
    }
}
