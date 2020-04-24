package com.company.project.core.mybatis.type;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Map;

/**
 * @author ZhangNima
 */
public class MapTypeHandler extends BaseObjectTypeHandler<Map<String, Object>> {
    @Override
    TypeReference<Map<String, Object>> getTypeReference() {
        return new TypeReference<Map<String, Object>>() {
        };
    }
}
