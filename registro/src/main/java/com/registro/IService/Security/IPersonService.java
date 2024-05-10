package com.registro.IService.Security;

import java.util.List;

import com.registro.DTO.Security.IDocumentPersonDto;
import com.registro.DTO.Security.IPersonDto;
import com.registro.Entity.Security.Person;
import com.registro.IService.IBaseService;

public interface IPersonService extends IBaseService<Person> {
	
	List<IPersonDto> getList();

/*	List<IDocumentPersonDto> getDocument();

	Person save(Person entity) throws Exception;

	public void updatePersonClient(Long id, Person entity) throws Exception;


 */
}
