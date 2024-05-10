package com.registro.Service.Security;

import java.util.List;

import com.registro.DTO.Security.IModuleDto;
import com.registro.Entity.Security.Module;
import com.registro.IRepository.IBaseRepository;
import com.registro.Service.ABaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registro.IRepository.Security.IModuleRepository;
import com.registro.IService.Security.IModuleService;

@Service
public class ModuleService extends ABaseService<Module> implements IModuleService{

	@Override
	protected IBaseRepository<Module, Long> getRepository() {
		return repository;
	}
	
	@Autowired
	private IModuleRepository repository;

	@Override
	public List<IModuleDto> getList() {
		return repository.getList();
	}	
}