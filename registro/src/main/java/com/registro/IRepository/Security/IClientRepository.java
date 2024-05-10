package com.registro.IRepository.Security;

import com.registro.DTO.Security.IClientDto;
import com.registro.Entity.Security.Client;
import com.registro.IRepository.IBaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IClientRepository extends IBaseRepository<Client, Long> {


    @Query(value="SELECT "
            + "*"
            + "FROM"
            + "client"
            + "WHERE"
            + "person_id = :id", nativeQuery =true)
    Client consultClient(@Param("id") Long id);

    @Query(value=" SELECT "
            + " c.code, "
            + " p.name, "
            + " FROM "
            + " client c "
            + " INNER JOIN "
            + " person p "
            + " ON "
            + " c.person_id = p.id "
            + " WHERE "
            + " c.deleted_at IS NULL", nativeQuery = true)
    List<IClientDto> getList();

}
