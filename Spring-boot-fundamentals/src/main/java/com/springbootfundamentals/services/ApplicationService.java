package com.springbootfundamentals.services;

import com.springbootfundamentals.models.Application;

import java.util.List;

public interface ApplicationService {
    List<Application> listApplications();

    Application findApplication(Integer id);

}
