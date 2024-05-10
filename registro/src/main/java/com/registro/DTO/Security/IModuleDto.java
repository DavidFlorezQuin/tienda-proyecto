package com.registro.DTO.Security;

import com.registro.DTO.IGenericDto;

public interface IModuleDto extends IGenericDto {


	String getModule();
	String getDescription();
	String getRoute();
}
