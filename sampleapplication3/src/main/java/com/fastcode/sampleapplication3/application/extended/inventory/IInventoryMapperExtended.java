package com.fastcode.sampleapplication3.application.extended.inventory;

import org.mapstruct.Mapper;
import com.fastcode.sampleapplication3.application.core.inventory.IInventoryMapper;

@Mapper(componentModel = "spring")
public interface IInventoryMapperExtended extends IInventoryMapper {

}

