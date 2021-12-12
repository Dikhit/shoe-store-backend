package com.dikhit.shoeStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dikhit.shoeStore.exception.ResourceNotFound;
import com.dikhit.shoeStore.interfaces.RoleInterface;
import com.dikhit.shoeStore.model.Role;
import com.dikhit.shoeStore.repository.RoleRepositoty;

@Service
public class RoleService implements RoleInterface{
	
	@Autowired
	private RoleRepositoty roleRepository;

	@Override
	public Role createRole(Role role) {
		return roleRepository.save(role);
	}
	

	@Override
	public Role updateRole(long id, Role role) {
		Role role1 = getRoleById(id);
		role1.setName(role.getName());
		return roleRepository.save(role1);
		
	}

	@Override
	public String deleteRole(Role role) {
		roleRepository.delete(role);
		return "role deleted successfully !!";
	}


	@Override
	public List<Role> getAllRoles() {
		return roleRepository.findAll();
	}


	@Override
	public Role getRoleById(long id) {
		return roleRepository.findById(id)
				.orElseThrow(
						() -> new ResourceNotFound("Role", "ID", id)
					);
	}
}
