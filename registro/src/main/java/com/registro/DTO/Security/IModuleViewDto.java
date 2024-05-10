package com.registro.DTO.Security;

import com.registro.DTO.IGenericDto;

public interface IModuleViewDto extends IGenericDto {
	String getViewName();
	String getRouteName();
}
