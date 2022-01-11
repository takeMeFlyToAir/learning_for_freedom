package com.zzr.design_patterns.abstractdocument.domain;

import com.zzr.design_patterns.abstractdocument.Document;
import com.zzr.design_patterns.abstractdocument.domain.enums.Property;

import java.util.Optional;

/**
 * @author zhaozhirong
 * @date 2022/1/9 10:31 下午
 */
public interface HasModel extends Document {

    default Optional<String> getModel() {
        return Optional.ofNullable((String) get(Property.MODEL.name()));
    }

}
