package com.registro.DTO.Security;

import java.util.List;

public class UserResponseDto {
    private IUserDto user;
    private List<IUserRoleDto> roles;

    private List<IRoleViewDto> view;

    public List<IRoleViewDto> getView() {
        return view;
    }

    public void setView(List<IRoleViewDto> view) {
        this.view = view;
    }

    public IUserDto getUser() {
        return user;
    }

    public void setUser(IUserDto user) {
        this.user = user;
    }

    public List<IUserRoleDto> getRoles() {
        return roles;
    }

    public void setRoles(List<IUserRoleDto> roles) {
        this.roles = roles;
    }


}
