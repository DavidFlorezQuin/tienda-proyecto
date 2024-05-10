package com.registro.Controller.Security;

import com.registro.Controller.ABaseController;
import com.registro.DTO.ApiResponseDto;
import com.registro.DTO.Security.IModuleViewDto;
import com.registro.Entity.Security.ModuleView;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.registro.IService.Security.IModuleViewService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/module-view")
public class ModuleViewController extends ABaseController<ModuleView,IModuleViewService> {
    public ModuleViewController(IModuleViewService service) {
        super(service, "ModuleView");
    }



    /*  @PostMapping("/moduleView")
    public ResponseEntity<ApiResponseDto<List<IModuleViewDto>>> showRole(@RequestBody ModuleViewDto moduleId){
        //Long id = moduleId.getId();
        try{
            List<IModuleViewDto> entity = service.getModuleView(id);
            return ResponseEntity.ok(new ApiResponseDto<List<IModuleViewDto>>("Registro encontrado", entity, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IModuleViewDto>>(e.getMessage(), null, false));
        }
    }

   */

}
