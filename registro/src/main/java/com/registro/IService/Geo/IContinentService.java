package com.registro.IService.Geo;

import com.registro.DTO.Geo.IContinentDto;
import com.registro.Entity.Geo.Continent;
import com.registro.IService.IBaseService;

import java.util.List;

public interface IContinentService extends IBaseService<Continent> {

    List<IContinentDto> getList();

}
