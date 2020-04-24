package com.company.project.core.mybatis.type;

import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

/**
 * String List类型转换器。
 *
 * @author Ma Xuezhi
 */
public class StringListTypeHandler extends BaseObjectTypeHandler<List<String>> {

    @Override
    TypeReference<List<String>> getTypeReference() {
        return new TypeReference<List<String>>() {
        };
    }
}
