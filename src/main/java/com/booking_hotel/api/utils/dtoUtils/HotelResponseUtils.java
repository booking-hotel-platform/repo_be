package com.booking_hotel.api.utils.dtoUtils;

import com.booking_hotel.api.amenity.dto.AmenityResponse;
import com.booking_hotel.api.amenity.entity.Amenity;
import com.booking_hotel.api.hotel.dto.HotelResponse;
import com.booking_hotel.api.hotel.entity.Hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelResponseUtils {
    public static HotelResponse buildHotelResponse(Hotel hotel) {
        return HotelResponse.builder()
                .id(hotel.getHotelId())
                .name(hotel.getName())
                .city(hotel.getCity())
                .address(hotel.getAddress())
                .description(hotel.getDescription())
                .country(hotel.getCountry())
                .cheapestPrice(hotel.getCheapestPrice())
                .photos(hotel.getPhotos())
                .rating(hotel.getRating())
                .build();
    }

    public static List<HotelResponse> convertToHotelResponseList(List<Hotel> hotelList) {
        List<HotelResponse> HotelResponseList = new ArrayList<>();
        for (Hotel hotel : hotelList) {
            HotelResponseList.add(buildHotelResponse(hotel));
        }
        return HotelResponseList;
    }
}
