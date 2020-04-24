package com.company.project.core.mybatis.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * JavaBean对象与数据字段转换器。
 *
 * @author ZhangNima
 */
public abstract class BaseObjectTypeHandler<T> extends BaseTypeHandler<T> {
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseObjectTypeHandler.class);

    private final ObjectMapper objectMapper;

    public BaseObjectTypeHandler() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        this.objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        this.objectMapper.configure(SerializationFeature.WRITE_ENUMS_USING_INDEX, true);
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, T parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, toJson(parameter));
    }

    @Override
    public T getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return fromJson(rs.getString(columnName));
    }

    @Override
    public T getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return fromJson(rs.getString(columnIndex));
    }

    @Override
    public T getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return fromJson(cs.getString(columnIndex));
    }

    private String toJson(T source) {
        String result = null;
        if (source != null) {
            try {
                result = objectMapper.writeValueAsString(source);
            } catch (JsonProcessingException ex) {
                LOGGER.error("Failed to serialize the object: {}", source, ex);
                return null;
            }
        }

        return result;
    }

    private T fromJson(String source) {
        if (source == null || source.trim().length() == 0) {
            return null;
        }

        try {
            return objectMapper.readValue(source, getTypeReference());
        } catch (IOException ex) {
            LOGGER.warn("Failed to deserialize the string {} to the type of List<String>", source, ex);
            return null;
        }
    }

    /**
     * 获取处理对象类型。
     *
     * @return 处理对象类型
     */
    abstract TypeReference<T> getTypeReference();
}
