package com.phonebooker;

import com.phonebooker.jpa.PhoneEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface PhoneMapper {

    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "name", source = "name"),
            @Mapping(target = "testername", source = "bookingEntity.testerName"),
            @Mapping(target = "bookedAt", source = "bookingEntity.bookingdate")
    })
    com.phonebooker.openapi.model.Phone mapToApiModel(PhoneEntity entity);
}

