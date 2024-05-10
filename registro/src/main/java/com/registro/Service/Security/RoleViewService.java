package com.registro.Service.Security;

import com.registro.DTO.Security.IRoleViewDto;
import com.registro.Entity.Security.RoleView;
import com.registro.IRepository.IBaseRepository;
import com.registro.IRepository.Security.IRoleViewRepository;
import com.registro.IService.Security.IRoleViewService;
import com.registro.Service.ABaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleViewService extends ABaseService<RoleView> implements IRoleViewService {

    @Autowired
    private IRoleViewRepository repository;

    @Override
    public List<IRoleViewDto> getList() {
        return repository.getList();
    }

    @Override
    public List<IRoleViewDto> getRoleView(Long id) {
        return repository.getViewRole(id);
    }

    @Override
    protected IBaseRepository<RoleView, Long> getRepository() {
        return repository;
    }
}
