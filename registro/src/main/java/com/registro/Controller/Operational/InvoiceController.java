package com.registro.Controller.Operational;

import com.registro.Controller.ABaseController;
import com.registro.DTO.ApiResponseDto;
import com.registro.DTO.Operational.IInvoiceDto;
import com.registro.DTO.Operational.IInvoicePriceDto;
import com.registro.DTO.Operational.IProductDto;
import com.registro.Entity.Operational.Invoice;
import com.registro.IService.Operational.IInvoiceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/invoice")
public class InvoiceController extends ABaseController<Invoice, IInvoiceService> {
    /**
     * Constructor for ABaseController.
     *
     * @param service    The service for the entity.
     */
    protected InvoiceController(IInvoiceService service) {
        super(service, "invoice");
    }

    @GetMapping("/list")
    public ResponseEntity<ApiResponseDto<List<IInvoiceDto>>> show(){
        try{
            List<IInvoiceDto> entity = service.getList();
            return  ResponseEntity.ok(new ApiResponseDto<List<IInvoiceDto>>("Registro encontrado", entity, true));

        } catch (Exception e){
            return  ResponseEntity.internalServerError().body(new ApiResponseDto<List<IInvoiceDto>>(e.getMessage(), null, false));
        }
    }

    @GetMapping("/total-price/{id}")
    public ResponseEntity<ApiResponseDto<Optional<IInvoicePriceDto>>> showTotal(@PathVariable Long id){
        try{
            Optional<IInvoicePriceDto> entity = service.getTotalPrice(id);
            return  ResponseEntity.ok(new ApiResponseDto<Optional<IInvoicePriceDto>>("Registro encontrado", entity, true));

        } catch (Exception e){
            return  ResponseEntity.internalServerError().body(new ApiResponseDto<Optional<IInvoicePriceDto>>(e.getMessage(), null, false));
        }
    }
}
