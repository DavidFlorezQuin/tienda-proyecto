package com.registro.Service.Security;

import java.util.List;

import com.registro.DTO.Security.IViewDto;
import com.registro.Entity.Security.View;
import com.registro.IRepository.IBaseRepository;
import com.registro.Service.ABaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.registro.IRepository.Security.IViewRepository;
import com.registro.IService.Security.IViewService;

@Service
public class ViewService extends ABaseService<View> implements IViewService{

	@Override
	protected IBaseRepository<View, Long> getRepository() {
		return repository;
	}
	
	@Autowired
	private IViewRepository repository;

	@Override
	public List<IViewDto> getList() {
		return repository.getList();
	}
	
	
}