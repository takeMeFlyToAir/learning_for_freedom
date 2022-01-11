package com.zzr.design_patterns.abstractdocument.domain;

import com.zzr.design_patterns.abstractdocument.Document;
import com.zzr.design_patterns.abstractdocument.domain.enums.Property;

import java.util.stream.Stream;

/**
 * @author zhaozhirong
 * @date 2022/1/9 10:36 下午
 */
public interface HasParts extends Document {

    default Stream<Part> getParts() {
        return children(Property.PARTS.name(), Part::new);
    }

}
