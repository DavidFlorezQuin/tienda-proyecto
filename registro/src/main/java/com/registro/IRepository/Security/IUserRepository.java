package com.registro.IRepository.Security;

import java.util.List;
import java.util.Optional;

import com.registro.DTO.Security.IRoleDto;
import com.registro.DTO.Security.IUserDto;
import com.registro.Entity.Security.User;
import com.registro.IRepository.IBaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface IUserRepository extends IBaseRepository<User, Long> {
	@Query(value = " SELECT "
			+ " u.id,	"
			+ " u.username user, "
			+ " u.state "
			+ " FROM "
			+ "	user u "
			+ " INNER JOIN person p ON p.id = u.person_id "
			+ " WHERE "
			+ "	u.username = :username AND "
			+ " u.password = :password  ", nativeQuery = true)
	Optional<IUserDto> getLogin(String username, String password);


	@Query(value = "SELECT "
			+ "u.id, "
			+ "u.username AS user, "
			+ "u.password AS userPassword, "
			+ "u.state, "
			+ "CONCAT(p.first_name, ' ', p.last_name) AS person "
			+ "FROM "
			+ "user u "
			+ "INNER JOIN "
			+ "person p "
			+ " ON "
			+ " p.id = u.person_id "
			+ " WHERE "
			+  "u.deleted_at IS NULL", nativeQuery = true)
	List<IUserDto> getList();

}
