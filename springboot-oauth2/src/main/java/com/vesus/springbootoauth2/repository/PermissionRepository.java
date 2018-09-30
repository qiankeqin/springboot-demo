package com.vesus.springbootoauth2.repository;

import com.vesus.springbootoauth2.model.Permission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends CrudRepository<Permission,Integer> {

}
