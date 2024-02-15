package com.redev.myplaces.dto;

import com.redev.myplaces.entity.User;
import org.springframework.stereotype.Component;

@Component
public class DtoConverter {
    public UserDto convertUserDto(User user)
    {
        return new UserDto(user.getId(), user.getUserName(), user.getDisplayName(), user.getEmail(),null);
    }
}
