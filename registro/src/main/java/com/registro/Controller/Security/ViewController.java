package com.registro.Controller.Security;

import java.util.List;

import com.registro.Controller.ABaseController;
import com.registro.DTO.ApiResponseDto;
import com.registro.DTO.Security.IViewDto;
import com.registro.Entity.Security.View;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registro.IService.Security.IViewService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/view")
public class    ViewController extends ABaseController<View,IViewService> {
	public ViewController(IViewService service) {
        super(service, "view");
    }
	
	@GetMapping("/list")
    public ResponseEntity<ApiResponseDto<List<IViewDto>>> show() {
        try {
            List<IViewDto> entity = service.getList();
            return ResponseEntity.ok(new ApiResponseDto<List<IViewDto>>("Registro encontrado", entity, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IViewDto>>(e.getMessage(), null, false));
        }
    }
}
