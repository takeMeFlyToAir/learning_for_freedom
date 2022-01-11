package com.zzr.design_patterns.abstractdocument.domain;

import com.zzr.design_patterns.abstractdocument.AbstractDocument;

import java.util.Map;

/**
 * @author zhaozhirong
 * @date 2022/1/9 10:34 下午
 */
public class Part extends AbstractDocument implements HasModel, HasPrice, HasType {

    public Part(Map<String, Object> properties) {
        super(properties);
    }
}
