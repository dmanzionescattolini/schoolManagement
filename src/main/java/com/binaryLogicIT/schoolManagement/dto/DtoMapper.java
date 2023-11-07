package com.binaryLogicIT.schoolManagement.dto;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DtoMapper {

    private final ObjectMapper objectMapper;

    public DtoMapper() {
        this.objectMapper = new ObjectMapper();
    }

    public <T> T mapDtoToEntity(Object dto, Class<T> entityClass) throws Exception {
        return objectMapper.convertValue(dto, entityClass);
    }

    public <T> T mapEntityToDto(Object entity, Class<T> dtoClass) throws Exception {
        return objectMapper.convertValue(entity, dtoClass);
    }
}
