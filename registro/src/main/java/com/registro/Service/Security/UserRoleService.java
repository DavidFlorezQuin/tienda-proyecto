package com.registro.Service.Security;

import com.registro.DTO.Security.IListUserRoleDto;
import com.registro.DTO.Security.IUserRoleDto;
import com.registro.Entity.Security.UserRole;
import com.registro.IRepository.IBaseRepository;
import com.registro.Service.ABaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registro.IRepository.Security.IUserRoleRepository;
import com.registro.IService.Security.IUserRoleService;

import java.util.List;

@Service
public class UserRoleService extends ABaseService<UserRole> implements IUserRoleService{

	@Override
	protected IBaseRepository<UserRole, Long> getRepository() {
		return repository;
	}
	
	@Autowired
	private IUserRoleRepository repository;

	@Override
	public List<IListUserRoleDto> getList() {
		return repository.getList();
	}
	@Override
	public List<IUserRoleDto> getUserRole(Long userId) {
		return repository.getUserRole(userId);
	}
}
