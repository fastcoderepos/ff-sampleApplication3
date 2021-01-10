package com.fastcode.sampleapplication3.application.extended.film;

import org.mapstruct.Mapper;
import com.fastcode.sampleapplication3.application.core.film.IFilmMapper;

@Mapper(componentModel = "spring")
public interface IFilmMapperExtended extends IFilmMapper {

}

