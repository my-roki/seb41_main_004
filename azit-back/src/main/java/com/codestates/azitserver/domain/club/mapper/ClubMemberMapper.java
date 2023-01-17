package com.codestates.azitserver.domain.club.mapper;

import org.mapstruct.Mapper;

import com.codestates.azitserver.domain.club.dto.ClubMemberDto;
import com.codestates.azitserver.domain.club.entity.ClubMember;

@Mapper(componentModel = "spring")
public interface ClubMemberMapper {
	ClubMemberDto.Response clubMemberToClubMemberDtoResponse(ClubMember clubMember);
}