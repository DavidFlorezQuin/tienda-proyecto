package com.registro.Service.Geo;

import java.util.List;

import com.registro.DTO.Geo.ICountryDto;
import com.registro.Entity.Geo.Country;
import com.registro.IRepository.Geo.ICountryRepository;
import com.registro.IRepository.IBaseRepository;
import com.registro.IService.Geo.ICountryService;
import com.registro.Service.ABaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CountryService extends ABaseService<Country> implements ICountryService {


	@Autowired
	public ICountryRepository repository;

	@Override
	protected IBaseRepository<Country, Long> getRepository() {
		return repository;
	}

	@Override
	public List<ICountryDto> getList() {
		return repository.getList();
	}
}
