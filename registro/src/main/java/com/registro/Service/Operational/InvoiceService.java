package com.registro.Service.Operational;

import com.registro.DTO.Operational.IInventoryDto;
import com.registro.DTO.Operational.IInvoiceDto;
import com.registro.DTO.Operational.IInvoicePriceDto;
import com.registro.Entity.Operational.Inventory;
import com.registro.Entity.Operational.Invoice;
import com.registro.IRepository.IBaseRepository;
import com.registro.IRepository.Operational.IInvoiceRepository;
import com.registro.IService.Operational.IInventoryService;
import com.registro.IService.Operational.IInvoiceService;
import com.registro.Service.ABaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService extends ABaseService<Invoice> implements IInvoiceService {

    @Autowired
    private IInvoiceRepository repository;

    @Override
    public List<IInvoiceDto> getList() {
        return repository.getList();
    }

    @Override
    public Optional<IInvoicePriceDto> getTotalPrice(Long id) {
        return repository.getTotalPrice(id);
    }

    @Override
    protected IBaseRepository<Invoice, Long> getRepository() {
        return repository;
    }
}
