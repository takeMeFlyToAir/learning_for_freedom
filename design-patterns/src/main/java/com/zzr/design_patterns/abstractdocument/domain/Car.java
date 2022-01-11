package com.zzr.design_patterns.abstractdocument.domain;

import com.zzr.design_patterns.abstractdocument.AbstractDocument;

import java.util.Map;

/**
 * @author zhaozhirong
 * @date 2022/1/9 10:35 下午
 */

public class Car extends AbstractDocument implements HasModel, HasPrice, HasParts {


    public Car(Map<String, Object> properties) {
        super(properties);
    }
}
