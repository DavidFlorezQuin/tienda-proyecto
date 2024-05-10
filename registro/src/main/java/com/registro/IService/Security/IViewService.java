package com.registro.IService.Security;

import java.util.List;

import com.registro.DTO.Security.IViewDto;
import com.registro.Entity.Security.View;
import com.registro.IService.IBaseService;

public interface IViewService extends IBaseService<View> {
	List<IViewDto> getList();
}
