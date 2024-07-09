package br.com.myapp.service;

import br.com.myapp.dto.ClubDto;
import br.com.myapp.models.Club;

import java.util.List;

public interface ClubService {

    List<ClubDto> findAllClubs();

    Club saveClub(Club club);


}
