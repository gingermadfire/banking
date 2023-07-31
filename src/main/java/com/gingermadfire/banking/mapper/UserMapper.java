package com.gingermadfire.banking.mapper;

import com.gingermadfire.banking.persistence.User;
import com.gingermadfire.banking.rest.api.exchange.request.UserRequest;
import com.gingermadfire.banking.rest.api.exchange.response.UserResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserRequest map(User user);

    User map(UserResponse userResponse);

}
