package com.fastcode.sampleapplication3.application.extended.country;

import org.mapstruct.Mapper;
import com.fastcode.sampleapplication3.application.core.country.ICountryMapper;

@Mapper(componentModel = "spring")
public interface ICountryMapperExtended extends ICountryMapper {

}

