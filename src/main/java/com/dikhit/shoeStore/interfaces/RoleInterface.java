package com.dikhit.shoeStore.interfaces;

import java.util.List;

import com.dikhit.shoeStore.model.Role;

public interface RoleInterface {
	Role createRole(Role role);
	List<Role> getAllRoles();
	Role getRoleById(long id);
	Role updateRole(long id, Role role);
	String deleteRole(Role role);
}
