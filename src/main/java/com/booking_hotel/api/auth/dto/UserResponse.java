package com.booking_hotel.api.auth.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {
    private Long userId;
    private String username;
    private String email;
    private boolean isBanned;
}
