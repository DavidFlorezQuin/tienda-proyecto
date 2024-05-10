package com.registro.Service.Security;

import java.util.List;

import com.registro.DTO.Security.IRoleDto;
import com.registro.Entity.Security.Role;
import com.registro.IRepository.IBaseRepository;
import com.registro.Service.ABaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registro.IRepository.Security.IRoleRepository;
import com.registro.IService.Security.IRoleService;

@Service
public class RoleService extends ABaseService<Role> implements IRoleService{

	@Override
	protected IBaseRepository<Role, Long> getRepository() {
		return repository;
	}
	
	@Autowired
	private IRoleRepository repository;

	@Override
	public List<IRoleDto> getList() {
		return repository.getList();
	}	
}
