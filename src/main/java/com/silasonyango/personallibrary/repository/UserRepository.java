package com.silasonyango.personallibrary.repository;

import com.silasonyango.personallibrary.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by rajeevkumarsingh on 27/06/17.
 */

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    @Query(nativeQuery = true)
    public List<UserModel> getUsers();
}
