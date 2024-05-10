package com.registro.IRepository.Security;

import java.util.List;

import com.registro.DTO.Security.IDocumentPersonDto;
import com.registro.DTO.Security.IPersonDto;
import com.registro.Entity.Security.Person;
import com.registro.IRepository.IBaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface IPersonRepository extends IBaseRepository<Person, Long> {

		@Query(value = " SELECT  "
			+ " id, "
			+ " concat(first_name,'  ',last_name) as person "
			+ "	FROM  "
			+ "	person "
			+ "	WHERE  "
			+ " deleted_at IS NULL", nativeQuery = true)
	List<IPersonDto> getList();


/*	@Query(value = " SELECT  "
			+ " id, "
			+ " dni, "
			+ " type_dni typeDni, "
			+ " concat(first_name,'  ',last_name) as person "
			+ "	FROM  "
			+ "	person "
			+ "	WHERE  "
			+ " deleted_at IS NULL", nativeQuery = true)
	List<IDocumentPersonDto> getDocument();
	*/




}
