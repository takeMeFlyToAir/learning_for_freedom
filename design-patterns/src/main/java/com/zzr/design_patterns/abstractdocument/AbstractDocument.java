package com.zzr.design_patterns.abstractdocument;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author zhaozhirong
 * @date 2022/1/9 10:18 下午
 */
public abstract class AbstractDocument implements Document {

    private final Map<String, Object> properties;

    public AbstractDocument(Map<String, Object> properties) {
        Objects.requireNonNull(properties, "properties map is required");
        this.properties = properties;
    }

    @Override
    public void put(String key, Object value) {
        properties.put(key, value);
    }

    @Override
    public Object get(String key) {
        return properties.get(key);
    }

    @Override
    public <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor) {
        Optional<List<Map<String, Object>>> optional = Stream.of(get(key)).filter(Objects::nonNull)
                .map(el -> (List<Map<String, Object>>) el).findAny();
        return optional.map(maps -> maps.stream().map(constructor)).orElseGet(Stream::empty);
    }
}
