package com.registro.IService.Operational;

import com.registro.DTO.Operational.IInventoryDto;
import com.registro.Entity.Operational.Inventory;
import com.registro.IService.IBaseService;

import java.util.List;

public interface IInventoryService extends IBaseService<Inventory> {
    List<IInventoryDto> getList();

}
