package com.registro.Service.Operational;

import com.registro.DTO.Operational.IDetailPriceDto;
import com.registro.DTO.Operational.IInvoiceDetailDto;
import com.registro.DTO.Operational.ISupplyProductInvoiceDto;
import com.registro.Entity.Operational.InvoiceDetail;
import com.registro.IRepository.IBaseRepository;
import com.registro.IRepository.Operational.IInvoiceDetailRepository;
import com.registro.IService.Operational.IInvoiceDetailService;
import com.registro.Service.ABaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class InvoiceDetailService extends ABaseService<InvoiceDetail> implements IInvoiceDetailService {

    @Autowired
    private IInvoiceDetailRepository repository;


    @Override
    public List<IInvoiceDetailDto> getList() {
            return repository.getList();
    }

    @Override
    public List<IInvoiceDetailDto> getDetailData(Long id) {
        return repository.getDetailData(id);
    }

    @Override
    public List<ISupplyProductInvoiceDto> getSupplyInvoiceDetail(Long id) {
        return repository.getSupplyInvoiceDetail(id);
    }


    @Override
    protected IBaseRepository<InvoiceDetail, Long> getRepository() {
        return repository;
    }



}
