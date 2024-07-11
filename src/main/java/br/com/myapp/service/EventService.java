package br.com.myapp.service;

import br.com.myapp.dto.EventDto;

import java.util.List;

public interface EventService {

    void createEvent(Long clubId, EventDto eventDto);

    List<EventDto> findAllEvents();



}
