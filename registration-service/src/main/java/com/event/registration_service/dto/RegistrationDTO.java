package com.event.registration_service.dto;

import java.time.LocalDate;

public class RegistrationDTO {
    private String participantName;
    private String participantEmail;
    private LocalDate registrationDate;

    // Constructor + getters/setters

    public RegistrationDTO() {
    }

    public RegistrationDTO(String participantName, String participantEmail, LocalDate registrationDate) {
        this.participantName = participantName;
        this.participantEmail = participantEmail;
        this.registrationDate = registrationDate;
   }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public String getParticipantEmail() {
        return participantEmail;
    }

    public void setParticipantEmail(String participantEmail) {
        this.participantEmail = participantEmail;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
}


