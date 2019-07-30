package com.silasonyango.personallibrary.repository;

import com.silasonyango.personallibrary.models.library_resource.ResourceTypesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceTypesRepository extends JpaRepository<ResourceTypesModel, Long> {
}
