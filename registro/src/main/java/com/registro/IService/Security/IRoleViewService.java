package com.registro.IService.Security;

import com.registro.DTO.Security.IRoleViewDto;
import com.registro.Entity.Security.RoleView;
import com.registro.IService.IBaseService;

import java.util.List;

public interface IRoleViewService extends IBaseService<RoleView> {

    List<IRoleViewDto> getList();
    List<IRoleViewDto> getRoleView(Long id);
}
