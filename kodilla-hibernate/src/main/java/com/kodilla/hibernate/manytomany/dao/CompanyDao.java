package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface CompanyDao extends CrudRepository <Company, Integer> {
    @Query(nativeQuery = true)
    List<Company> retrieveCompanyName (@Param("COMPANY_NAME") String name);

    @Query
    Optional<List<Company>>retrieveCompaniesWithNamesPart (@Param("COMPANY_NAME") String name);

}
