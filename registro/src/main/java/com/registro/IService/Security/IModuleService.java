package com.registro.IService.Security;

import com.registro.DTO.Security.IModuleDto;
import com.registro.Entity.Security.Module;
import com.registro.IService.IBaseService;

import java.util.List;


public interface IModuleService extends IBaseService<Module> {
	List<IModuleDto> getList();

}
