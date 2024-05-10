package com.registro.IService.Security;

import java.util.List;

import com.registro.DTO.Security.IRoleDto;
import com.registro.Entity.Security.Role;
import com.registro.IService.IBaseService;

public interface IRoleService extends IBaseService<Role> {

	List<IRoleDto> getList();
}
