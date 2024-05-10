package com.registro.Controller.Security;

import java.util.List;


import com.registro.Controller.ABaseController;
import com.registro.DTO.ApiResponseDto;
import com.registro.DTO.Security.IModuleDto;
import com.registro.Entity.Security.Module;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.registro.IService.Security.IModuleService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/module")
public class ModuleController extends ABaseController<Module, IModuleService> {
	public ModuleController(IModuleService service) {
        super(service, "Module");
    }
	
	@GetMapping("/list")
    public ResponseEntity<ApiResponseDto<List<IModuleDto>>> show() {
        try {
            List<IModuleDto> entity = service.getList();
            return ResponseEntity.ok(new ApiResponseDto<List<IModuleDto>>("Registro encontrado", entity, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IModuleDto>>(e.getMessage(), null, false));
        }
    }
}
