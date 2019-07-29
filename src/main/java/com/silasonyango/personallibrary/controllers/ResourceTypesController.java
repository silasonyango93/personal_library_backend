package com.silasonyango.personallibrary.controllers;

import com.silasonyango.personallibrary.models.ResourceTypesModel;
import com.silasonyango.personallibrary.models.UserModel;
import com.silasonyango.personallibrary.repository.ResourceTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
@RestController
@RequestMapping("/resource_types")
public class ResourceTypesController {
    @Autowired
    ResourceTypesRepository resourceTypesRepository;


    @PostMapping("/create_resource_type")
    public ResourceTypesModel createResourceType(@Valid ResourceTypesModel resourceType) {

        return resourceTypesRepository.save(resourceType);
    }
}
