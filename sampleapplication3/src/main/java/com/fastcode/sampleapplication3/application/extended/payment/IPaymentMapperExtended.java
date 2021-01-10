package com.fastcode.sampleapplication3.application.extended.payment;

import org.mapstruct.Mapper;
import com.fastcode.sampleapplication3.application.core.payment.IPaymentMapper;

@Mapper(componentModel = "spring")
public interface IPaymentMapperExtended extends IPaymentMapper {

}

