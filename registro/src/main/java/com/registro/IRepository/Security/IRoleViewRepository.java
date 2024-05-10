package com.registro.IRepository.Security;

import com.registro.DTO.Security.IRoleViewDto;
import com.registro.Entity.Security.RoleView;
import com.registro.IRepository.IBaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRoleViewRepository extends IBaseRepository<RoleView, Long> {

    @Query(value = " SELECT "
                    + " rv.id, "
                    + " r.name AS roleName, "
                    + " v.name AS viewName, "
                    + " rv.state "
                    + " FROM "
                    + " role_view rv "
                    + " INNER JOIN "
                    + " view v "
                    + " ON "
                    + " v.id = rv.view_id "
                    + " INNER JOIN "
                    + " ON "
                    + " r.id = rv.role_id "
                    + " WHERE "
                    + " rv.deleted_at IS NULL", nativeQuery = true)
    List<IRoleViewDto> getList();

    @Query(value = " SELECT "
            + " rv.id AS id, "
            + " r.name AS roleName, "
            + " v.name AS viewName, "
            + " v.route AS routeName"
            + " FROM "
            + " role_view rv "
            + " INNER JOIN "
            + " view v "
            + " ON "
            + " v.id = rv.view_id "
            + " INNER JOIN "
            + " role r "
            + " ON "
            + " r.id = rv.role_id "
            + " WHERE "
            + " rv.role_id = :id "
            + " AND "
            + " rv.deleted_at IS NULL", nativeQuery = true)
    List<IRoleViewDto> getViewRole(Long id);



}
