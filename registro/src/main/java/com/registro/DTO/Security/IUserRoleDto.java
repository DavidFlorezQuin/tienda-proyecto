package com.registro.DTO.Security;

import com.registro.DTO.IGenericDto;

import java.util.List;

public interface IUserRoleDto extends IGenericDto {
    String getRoleName();
    String getRoute();

}
