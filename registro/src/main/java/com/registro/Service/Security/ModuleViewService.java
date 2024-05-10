package com.registro.Service.Security;

import com.registro.DTO.Security.IModuleViewDto;
import com.registro.Entity.Security.ModuleView;
import com.registro.IRepository.IBaseRepository;
import com.registro.IRepository.Security.IModuleViewRepository;
import com.registro.Service.ABaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.registro.IService.Security.IModuleViewService;

import java.util.List;

@Service
public class ModuleViewService extends ABaseService<ModuleView> implements IModuleViewService{


	@Autowired
	private IModuleViewRepository repository;


	@Override
	protected IBaseRepository<ModuleView, Long> getRepository() {
		return repository;
	}


	@Override
	public List<IModuleViewDto> getList() {
		return repository.getList();
	}
}