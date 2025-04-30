package com.event.participant_service.controller;

import com.event.participant_service.model.Participant;
import com.event.participant_service.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/participant")
public class ParticipantController {

    @Autowired
    private ParticipantService participantService;

    @PostMapping
    public Participant add(@RequestBody Participant participant) {
        return participantService.addParticipant(participant);
    }

    @GetMapping
    public List<Participant> getAll() {
        return participantService.getAllParticipants();
    }

    @PostMapping("/register/{eventId}")
    public Participant registerToEvent(@PathVariable Long eventId, @RequestBody Participant participant){
        return participantService.registerToEvent(eventId, participant);
    }
}
