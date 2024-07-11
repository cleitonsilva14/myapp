package br.com.myapp.mapper;

import br.com.myapp.dto.ClubDto;
import br.com.myapp.models.Club;

import java.util.stream.Collectors;

import static br.com.myapp.mapper.EventMapper.mapToEventDto;

public class ClubMapper {

    public static Club mapToClub(ClubDto club){
        Club clubDto = Club.builder()
                .id(club.getId())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .createdOn(club.getCreatedOn())
                .createdBy(club.getCreatedBy())
                .updatedOn(club.getUpdatedOn())
                .build();
        return clubDto;
    }

    public static ClubDto mapToClubDto(Club club){
        ClubDto clubDto = ClubDto.builder()
                .id(club.getId())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .content(club.getContent())
                .createdBy(club.getCreatedBy())
                .createdOn(club.getCreatedOn())
                .updatedOn(club.getCreatedOn())
                .events(club.getEvents().stream().map((event) -> mapToEventDto(event)).collect(Collectors.toList()))
                .build();

        return clubDto;
    }

}
