package com.example.lakesidehotel.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponse {//response to the frontend request, it'll shown in frontend.

    private Long id;


    private LocalDate checkInDate;


    private LocalDate checkOutDate;


    private String guestName;


    private String guestEmail;


    private int NumOfAdults;


    private int NumOfChildren;


    private int totalNumOfGuest;


    private String bookingConfirmationCode;


    private RoomResponse room;

    public BookingResponse(Long id, LocalDate checkInDate, LocalDate checkOutDate, String bookingConfirmationCode) {
        this.id = id;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.bookingConfirmationCode = bookingConfirmationCode;
    }
}
