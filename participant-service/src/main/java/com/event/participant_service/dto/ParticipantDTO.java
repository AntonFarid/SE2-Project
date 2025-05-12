package com.event.participant_service.dto;

public class ParticipantDTO {
    private String name;
    private String email;
    private String eventTitle;

    // Constructors, getters, setters

    public ParticipantDTO() {
    }

    public ParticipantDTO(String name, String email, String eventTitle) {
        this.name = name;
        this.email = email;
        this.eventTitle = eventTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }
}