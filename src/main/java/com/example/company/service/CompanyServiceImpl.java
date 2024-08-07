package com.example.company.service;

import com.example.company.dataaccess.CompanyRepository;
import com.example.company.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService{
    CompanyRepository companyRepository;


    @Override
    public Iterable<Company> findAll() {
        return companyRepository.findAll();
    }

    @Override
    public Iterable<Company> findByName() {
        return null;
    }

    @Override
    public Iterable<Company> findAllByOrderBySales() {
        return companyRepository.findAllByOrderBySales();
    }

    @Override
    public Iterable<Company> findAllBySalesGreaterThanEqual(Integer sales) {
        return companyRepository.findAllBySalesGreaterThanEqual(sales);
    }


    @Autowired
    public void setCompanyRepository(CompanyRepository companyRepository){
        this.companyRepository = companyRepository;
    }
}
