package com.registro.Service.Security;

import java.util.List;

import com.registro.DTO.Security.IPersonDto;
import com.registro.Entity.Security.Person;
import com.registro.IRepository.IBaseRepository;
import com.registro.Service.ABaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registro.IRepository.Security.IPersonRepository;
import com.registro.IService.Security.IPersonService;


@Service
public class PersonService extends ABaseService<Person> implements IPersonService{
	@Override
	protected IBaseRepository<Person, Long> getRepository() {
		return repository;
	}

	@Autowired
	private IPersonRepository repository;

	@Override
	public List<IPersonDto> getList() {
		return repository.getList();
	}

	}

