package com.registro.Controller.Security;

import com.registro.Controller.ABaseController;
import com.registro.DTO.ApiResponseDto;
import com.registro.DTO.Security.IPersonDto;
import com.registro.DTO.Security.IRoleViewDto;
import com.registro.Entity.Security.RoleView;
import com.registro.IService.Security.IRoleViewService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/role-view")


public class RoleViewController extends ABaseController<RoleView, IRoleViewService> {
    /**
     * Constructor for ABaseController.
     *
     * @param service The service for the entity.
     */
    protected RoleViewController(IRoleViewService service) {
        super(service, "role_view");
    }

    @GetMapping("/list")
    public ResponseEntity<ApiResponseDto<List<IRoleViewDto>>> show() {
        try {
            List<IRoleViewDto> entity = service.getList();
            return ResponseEntity.ok(new ApiResponseDto<List<IRoleViewDto>>("Registro encontrado", entity, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IRoleViewDto>>(e.getMessage(), null, false));
        }
    }
    @GetMapping("/views/{id}")
    public ResponseEntity<ApiResponseDto<List<IRoleViewDto>>> showViews(@PathVariable Long id) {
        try {
            List<IRoleViewDto> entity = service.getRoleView(id);
            return ResponseEntity.ok(new ApiResponseDto<List<IRoleViewDto>>("Registro encontrado", entity, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IRoleViewDto>>(e.getMessage(), null, false));
        }
    }


}
