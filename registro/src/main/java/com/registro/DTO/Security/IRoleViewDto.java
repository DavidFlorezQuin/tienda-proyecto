package com.registro.DTO.Security;

import com.registro.DTO.IGenericDto;

public interface IRoleViewDto extends IGenericDto{

    String getRoleName();
    String getViewName();

    String getRouteName();

}
