package com.registro.IService.Operational;

import com.registro.DTO.Operational.IUnitMeasurementDto;
import com.registro.Entity.Operational.UnitMeasurement;
import com.registro.IService.IBaseService;

import java.util.List;

public interface IUnitMeasurementService extends IBaseService<UnitMeasurement> {

    List<IUnitMeasurementDto> getList();
}
