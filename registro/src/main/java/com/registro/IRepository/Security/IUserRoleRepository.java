package com.registro.IRepository.Security;

import com.registro.DTO.Security.IListUserRoleDto;
import com.registro.DTO.Security.IUserRoleDto;
import com.registro.Entity.Security.UserRole;
import com.registro.IRepository.IBaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface IUserRoleRepository extends IBaseRepository<UserRole, Long> {

    @Query(value = " SELECT "
            + " ur.id,"
            + " r.name AS roleName,"
            + " r.state "
            + " FROM "
            + "	user_role ur "
            + " INNER JOIN"
            + " role r"
            + " ON"
            + " r.id = ur.role_id "
            + " WHERE "
            + " ur.user_id = :userId  ", nativeQuery = true)
    List<IUserRoleDto> getUserRole(Long userId);

    @Query(value = " SELECT "
            + "	ur.id,"
            + "	u.username as user,"
            + " u.password as userPassword, "
            + " u.state, "
            + " r.name as roleName "
            + " r.description"
            + "	FROM "
            + "	user_role ur "
            + "	INNER JOIN "
            + "	user u "
            + "	ON "
            + "	u.id = ur.user_id "
            + "	INNER JOIN "
            + "	role r "
            + "	ON "
            + "	r.id = ur.role_id "
            + "	WHERE "
            + " ur.deleted_at IS NULL", nativeQuery = true)
    List<IListUserRoleDto> getList();

}
