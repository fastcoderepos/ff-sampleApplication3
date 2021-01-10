package com.fastcode.sampleapplication3.application.extended.customer;

import org.mapstruct.Mapper;
import com.fastcode.sampleapplication3.application.core.customer.ICustomerMapper;

@Mapper(componentModel = "spring")
public interface ICustomerMapperExtended extends ICustomerMapper {

}

