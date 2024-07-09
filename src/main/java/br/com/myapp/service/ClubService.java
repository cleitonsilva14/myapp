package br.com.myapp.service;

import br.com.myapp.dto.ClubDto;

import java.util.List;

public interface ClubService {

    List<ClubDto> findAllClubs();

}
