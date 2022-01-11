package com.zzr.design_patterns.abstractdocument;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.zzr.PrintLogger;
import com.zzr.design_patterns.abstractdocument.domain.Car;
import com.zzr.design_patterns.abstractdocument.domain.enums.Property;

import java.util.Map;

/**
 * @author zhaozhirong
 * @date 2022/1/9 10:15 下午
 */
public class App {

    /**
     * Program entry point.
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        Map wheelProperties = ImmutableMap.of(
                Property.TYPE.toString(), "wheel",
                Property.MODEL.toString(), "15C",
                Property.PRICE.toString(), 100L);

        Map doorProperties = ImmutableMap.of(
                Property.TYPE.toString(), "door",
                Property.MODEL.toString(), "Lambo",
                Property.PRICE.toString(), 300L);

        Map carProperties = ImmutableMap.of(
                Property.MODEL.toString(), "300SL",
                Property.PRICE.toString(), 10000L,
                Property.PARTS.toString(), Lists.newArrayList(wheelProperties, doorProperties));

        Car car = new Car(carProperties);

        PrintLogger.info("Here is our car:");
        PrintLogger.info("-> model: ", car.getModel());
        PrintLogger.info("-> price: ", car.getPrice());
        PrintLogger.info("-> parts: ");
        car.getParts().forEach(p -> PrintLogger.info(
                p.getType().orElse(null),
                p.getModel().orElse(null),
                p.getPrice().orElse(null))
        );
    }


}
