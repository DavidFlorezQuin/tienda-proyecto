package com.registro.IService.Geo;


import java.util.List;

import com.registro.DTO.Geo.ICountryDto;
import com.registro.Entity.Geo.Country;
import com.registro.IService.IBaseService;


public interface ICountryService  extends IBaseService<Country> {
	List<ICountryDto> getList();
}
