package com.registro.IService.Operational;

import com.registro.DTO.Operational.IInventoryDetailDto;
import com.registro.Entity.Operational.InventoryDetail;
import com.registro.IService.IBaseService;

import java.util.List;

public interface IInventoryDetailService extends IBaseService<InventoryDetail> {

    List<IInventoryDetailDto> getList();
}
