package com.example.company.service;
import com.example.company.model.Company;

public interface CompanyService {
    public Iterable<Company> findAll();
    public Iterable<Company> findByName();
    public Iterable<Company> findAllByOrderBySales();
    public Iterable<Company> findAllBySalesGreaterThanEqual(Integer sales);

}
