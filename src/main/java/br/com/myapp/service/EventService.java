package br.com.myapp.service;

import br.com.myapp.dto.EventDto;

public interface EventService {

    void createEvent(Long clubId, EventDto eventDto);


}
