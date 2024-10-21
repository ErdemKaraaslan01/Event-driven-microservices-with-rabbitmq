package com.erdemkaraaslan.message.dto;

/**
 * @param accountNumber
 * @param name
 * @param email
 * @param mobileNumber
 */
public record AccountsMsgDto(Long accountNumber, String name, String email, String mobileNumber) {
    //yukarıdaki parantez içindeki field'lar, accounts microservice'den gelecek.
}
