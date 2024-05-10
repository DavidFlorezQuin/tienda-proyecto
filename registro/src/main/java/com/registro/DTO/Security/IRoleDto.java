package com.registro.DTO.Security;

import com.registro.DTO.IGenericDto;

import java.util.List;

public interface IRoleDto extends IGenericDto {

	String getRole();
	String getDescription();
}
