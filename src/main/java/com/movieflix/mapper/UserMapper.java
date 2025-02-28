package com.movieflix.mapper;

import com.movieflix.entity.User;
import com.movieflix.controller.request.UserRequest;
import com.movieflix.controller.response.UserResponse;

public class UserMapper {
    public static User toUser(UserRequest userRequest) {
        return new User(null, userRequest.name(), userRequest.email(), userRequest.password());
    }

    public static UserResponse toUserResponse(User user) {
        return new UserResponse(user.getId(), user.getName(), user.getEmail());
    }
}
