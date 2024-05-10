package com.registro.IService.Operational;

import com.registro.DTO.IGenericDto;
import com.registro.DTO.Operational.ISupplyDto;
import com.registro.Entity.Operational.Supply;
import com.registro.IService.IBaseService;

import java.util.List;

public interface ISupplyService extends IBaseService<Supply> {

    List<ISupplyDto> getList();
}
