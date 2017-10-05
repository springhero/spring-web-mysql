package com.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springframework.domain.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

	public Role findByRole(String role);
}
