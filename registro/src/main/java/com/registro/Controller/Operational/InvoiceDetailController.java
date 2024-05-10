package com.registro.Controller.Operational;

import com.registro.Controller.ABaseController;
import com.registro.DTO.ApiResponseDto;
import com.registro.DTO.Operational.IDetailPriceDto;
import com.registro.DTO.Operational.IInvoiceDetailDto;
import com.registro.DTO.Operational.ISupplyProductInvoiceDto;
import com.registro.Entity.Operational.InvoiceDetail;
import com.registro.Service.Operational.InvoiceDetailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/invoice-detail")
public class InvoiceDetailController extends ABaseController<InvoiceDetail, InvoiceDetailService> {
    /**
     * Constructor for ABaseController.
     *
     * @param service    The service for the entity.
     */
    protected InvoiceDetailController(InvoiceDetailService service) {
        super(service, "InvoiceDetail");
    }

    @GetMapping("/list")
    public ResponseEntity<ApiResponseDto<List<IInvoiceDetailDto>>> show(){
        try{
            List<IInvoiceDetailDto> entity = service.getList();
            return  ResponseEntity.ok(new ApiResponseDto<List<IInvoiceDetailDto>>("Registro encontrado", entity, true));

        } catch (Exception e){
            return  ResponseEntity.internalServerError().body(new ApiResponseDto<List<IInvoiceDetailDto>>(e.getMessage(), null, false));
        }
    }

    @GetMapping("/detail-data/{id}")
    public ResponseEntity<ApiResponseDto<List<IInvoiceDetailDto>>> showDetail(@PathVariable Long id){
        try{
            List<IInvoiceDetailDto> entity = service.getDetailData(id);
            return  ResponseEntity.ok(new ApiResponseDto<List<IInvoiceDetailDto>>("Registro encontrado", entity, true));

        } catch (Exception e){
            return  ResponseEntity.internalServerError().body(new ApiResponseDto<List<IInvoiceDetailDto>>(e.getMessage(), null, false));
        }
    }

    @GetMapping("/detail-supply/{id}")
    public ResponseEntity<ApiResponseDto<List<ISupplyProductInvoiceDto>>> showDetailPrice(@PathVariable Long id){
        try{
            List<ISupplyProductInvoiceDto> entity = service.getSupplyInvoiceDetail(id);
            return  ResponseEntity.ok(new ApiResponseDto<List<ISupplyProductInvoiceDto>>("Registro encontrado", entity, true));

        } catch (Exception e){
            return  ResponseEntity.internalServerError().body(new ApiResponseDto<List<ISupplyProductInvoiceDto>>(e.getMessage(), null, false));
        }
    }
}
