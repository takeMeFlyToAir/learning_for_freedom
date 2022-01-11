package com.zzr.design_patterns.abstractdocument.domain;

import com.zzr.design_patterns.abstractdocument.Document;
import com.zzr.design_patterns.abstractdocument.domain.enums.Property;

import java.util.Optional;

/**
 * @author zhaozhirong
 * @date 2022/1/9 10:32 下午
 */
public interface HasType extends Document {

    default Optional<String> getType() {
        return Optional.ofNullable((String) get(Property.TYPE.name()));
    }

}
