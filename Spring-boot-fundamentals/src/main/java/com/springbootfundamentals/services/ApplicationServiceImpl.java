package com.springbootfundamentals.services;

import com.springbootfundamentals.exception.AppNotFoundException;
import com.springbootfundamentals.models.Application;
import com.springbootfundamentals.repositories.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationServiceImpl implements ApplicationService{

    @Autowired
    private ApplicationRepository applicationRepository;

    @Override
    public List<Application> listApplications() {
        return (List<Application>) applicationRepository.findAll();
    }

    @Override
    public Application findApplication(Integer id) {
        Optional<Application> optionalApplication = applicationRepository.findById(id);

        if(optionalApplication.isPresent())
            return optionalApplication.get();
        else
            throw new AppNotFoundException("Application Not Found");
    }
}
