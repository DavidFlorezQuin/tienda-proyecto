package com.registro.IService.Security;


import com.registro.DTO.Security.IModuleViewDto;
import com.registro.Entity.Security.ModuleView;
import com.registro.IService.IBaseService;

import java.util.List;

public interface IModuleViewService extends IBaseService<ModuleView> {

    List<IModuleViewDto> getList();

}
