package com.registro.Service.Geo;

import java.util.List;

import com.registro.DTO.Geo.ICityDto;
import com.registro.Entity.Geo.City;
import com.registro.IRepository.Geo.ICityRepository;
import com.registro.IRepository.IBaseRepository;
import com.registro.IService.Geo.ICityService;
import com.registro.Service.ABaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService extends ABaseService<City> implements ICityService {

	@Override
	protected IBaseRepository<City, Long> getRepository() {
		return repository;
	}
	
	@Autowired
	public ICityRepository repository;


	@Override
	public List<ICityDto> getList() {
		return repository.getList();
	}
}
