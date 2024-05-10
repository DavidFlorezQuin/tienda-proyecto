package com.registro.Service.Security;

import com.registro.DTO.Security.IClientDto;
import com.registro.Entity.Security.Client;
import com.registro.Entity.Security.Person;
import com.registro.IRepository.IBaseRepository;
import com.registro.IService.Security.IPersonService;
import com.registro.Service.ABaseService;

import com.registro.IRepository.Security.IClientRepository;
import com.registro.IService.Security.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService extends ABaseService<Client> implements IClientService {

    @Autowired
    public IClientRepository repository;

    @Autowired
    public IPersonService service;


    @Override
    protected IBaseRepository<Client, Long> getRepository() {
        return repository;
    }

    @Override
    public List<IClientDto> getList() {
        return repository.getList();
    }


    @Override
    public Client save(Client entity) throws Exception {
        try{
            Long IdPer = entity.getPerson().getId();

            Optional<Person> optionalPerson  = service.findById(IdPer);

            Person person = optionalPerson.get();

            String document = person.getNumberDocument();
            String tyDocument = person.getTypeDocument();



            String code = GenerateCodeClient(document, tyDocument, person.getCreatedAt());

            entity.setCode(code);
            entity.setCreatedAt(LocalDateTime.now());
            entity.setCreatedBy((long)1);
            return repository.save(entity);

        }catch (Exception e){
            throw new Exception("Error al gauardar entidad: " + e.getMessage());
        }
    }
    @Override
    public String GenerateCodeClient(String document, String typedocument, LocalDateTime year) throws Exception {
       int years  = year.getYear();
        String fourNumbers = document.substring(Math.max(0, document.length() - 4));
        String code = years + "-" + typedocument + "-" + fourNumbers;
        return code;
    }


}



