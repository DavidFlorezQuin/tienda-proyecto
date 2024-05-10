package com.registro.IRepository.Security;

import com.registro.DTO.Security.IModuleDto;
import com.registro.DTO.Security.IModuleViewDto;
import com.registro.Entity.Security.ModuleView;
import com.registro.IRepository.IBaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IModuleViewRepository extends IBaseRepository<ModuleView, Long> {

    @Query(value = " SELECT "
            + "	mv.id,"
            + "	m.name,"
            + " v.name "
            + "	FROM "
            + "	module_view mv"
            + "	INNER JOIN "
            + "	module m ON "
            + "	m.id = mv.module_id "
            + "	INNER JOIN "
            + "	view v "
            + "	v.id = mv.view_id "
            + "	WHERE "
            + " mv.deleted_at IS NULL", nativeQuery = true)
    List<IModuleViewDto> getList();
}
