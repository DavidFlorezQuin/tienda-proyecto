package com.registro.IService.Security;

import com.registro.DTO.Security.IListUserRoleDto;
import com.registro.DTO.Security.IUserRoleDto;
import com.registro.Entity.Security.UserRole;
import com.registro.IService.IBaseService;


import java.util.List;
import java.util.Optional;

public interface IUserRoleService extends IBaseService<UserRole> {


    List<IListUserRoleDto> getList();

    List<IUserRoleDto> getUserRole(Long id);

}
