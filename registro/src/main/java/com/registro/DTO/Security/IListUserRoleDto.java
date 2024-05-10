package com.registro.DTO.Security;

import com.registro.DTO.IGenericDto;

public interface IListUserRoleDto extends IGenericDto {

    String getUser();
    String getUserPassword();
    String getRoleName();
    String getDescription();
}
