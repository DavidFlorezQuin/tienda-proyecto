package com.registro.IService.Security;

import com.registro.DTO.Security.IClientDto;
import com.registro.Entity.Security.Client;
import com.registro.IService.IBaseService;

import java.time.LocalDateTime;
import java.util.List;

public interface IClientService extends IBaseService<Client> {

    List<IClientDto> getList();
    public String GenerateCodeClient(String document, String typedocument, LocalDateTime year) throws Exception;


    }
