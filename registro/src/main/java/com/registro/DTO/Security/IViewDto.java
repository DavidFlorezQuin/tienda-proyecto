package com.registro.DTO.Security;

import com.registro.DTO.IGenericDto;

public interface IViewDto extends IGenericDto {

	String getView();

	String getDescription();
	String getRoute();
}
