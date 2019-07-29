package com.silasonyango.personallibrary.repository;

import com.silasonyango.personallibrary.models.ResourceTypesModel;
import com.silasonyango.personallibrary.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceTypesRepository extends JpaRepository<ResourceTypesModel, Long> {
}
