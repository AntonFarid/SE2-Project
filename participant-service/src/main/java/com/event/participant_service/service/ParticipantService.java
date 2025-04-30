package com.event.participant_service.service;

import com.event.participant_service.model.Participant;
import com.event.participant_service.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipantService {

    @Autowired
    private ParticipantRepository participantRepository;

    public Participant addParticipant(Participant participant){
        return participantRepository.save(participant);
    }

    public List<Participant> getAllParticipants() {
        return participantRepository.findAll();
    }

    public Participant registerToEvent(Long eventId, @org.jetbrains.annotations.NotNull Participant participant) {
        participant.setEventId(eventId);
        return participantRepository.save(participant);
    }

}
