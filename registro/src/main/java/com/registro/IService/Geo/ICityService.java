package com.registro.IService.Geo;

import java.util.List;

import com.registro.DTO.Geo.ICityDto;
import com.registro.Entity.Geo.City;
import com.registro.IService.IBaseService;

public interface ICityService extends IBaseService<City> {
	List<ICityDto> getList();
}
