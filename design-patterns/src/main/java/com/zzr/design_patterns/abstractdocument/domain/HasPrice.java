package com.zzr.design_patterns.abstractdocument.domain;

import com.zzr.design_patterns.abstractdocument.Document;
import com.zzr.design_patterns.abstractdocument.domain.enums.Property;

import java.util.Optional;

/**
 * @author zhaozhirong
 * @date 2022/1/9 10:27 下午
 */
public interface HasPrice extends Document {

    default Optional<Number> getPrice() {
        return Optional.ofNullable((Number) get(Property.PRICE.name()));
    }

}
