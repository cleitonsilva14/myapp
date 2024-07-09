package br.com.myapp.service;

import br.com.myapp.dto.ClubDto;
import br.com.myapp.models.Club;

import java.util.List;

public interface ClubService {

    List<ClubDto> findAllClubs();

    Club saveClub(ClubDto clubDto);

    ClubDto findClubById(long id);

    void updateClub(ClubDto club);

    void delete(Long clubId);


}
