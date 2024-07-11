package br.com.myapp.mapper;

import br.com.myapp.dto.EventDto;
import br.com.myapp.models.Event;

public class EventMapper {
    // mapToEventDto
    public static Event mapToEvent(EventDto eventDto){
        return Event.builder()
                .id(eventDto.getId())
                .name(eventDto.getName())
                .startTime(eventDto.getStartTime())
                .endTime(eventDto.getEndTime())
                .type(eventDto.getType())
                .photoUrl(eventDto.getPhotoUrl())
                .createOn(eventDto.getCreateOn())
                .updatedOn(eventDto.getUpdatedOn())
                .build();
    }

    public static EventDto mapToEventDto(Event event){
        return EventDto.builder()
                .id(event.getId())
                .name(event.getName())
                .startTime(event.getStartTime())
                .endTime(event.getEndTime())
                .type(event.getType())
                .photoUrl(event.getPhotoUrl())
                .createOn(event.getCreateOn())
                .updatedOn(event.getUpdatedOn())
                .build();
    }
}
