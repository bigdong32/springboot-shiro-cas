package com.wds.springboot.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * id序列化器
 * 把Long转成String，防止前端精度丢失
 *
 * Created by wuds on 2017/7/27.
 */
public class BaseIdSerializer extends JsonSerializer<Long>{

    @Override
    public void serialize(Long aLong, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeString(aLong.toString());
        jsonGenerator.writeEndObject();
    }
}
