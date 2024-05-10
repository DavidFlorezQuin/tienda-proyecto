package com.registro.Controller.Security;

import com.registro.Controller.ABaseController;
import com.registro.DTO.ApiResponseDto;
import com.registro.DTO.Security.IClientDto;
import com.registro.Entity.Security.Client;

import com.registro.IService.Security.IClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/client")
public class ClientController extends ABaseController<Client, IClientService> {
    /**
     * Constructor for ABaseController.
     *
     * @param service The service for the entity.
     */
    protected ClientController(IClientService service) {
        super(service, "client");
    }

    @GetMapping("/list")
    public ResponseEntity<ApiResponseDto<List<IClientDto>>> show() {
        try {
            List<IClientDto> entity = service.getList();
            return ResponseEntity.ok(new ApiResponseDto<List<IClientDto>>("Registro encontrado", entity, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IClientDto>>(e.getMessage(), null, false));
        }

    }
}
