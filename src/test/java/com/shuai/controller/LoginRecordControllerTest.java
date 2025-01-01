package com.shuai.controller;

import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Test;

import javax.swing.text.html.Option;
import java.util.Optional;

class LoginRecordControllerTest {

    @Test
    void testOptional() {
        // 调用工厂方法创建Optional实例
        Optional<String> name = Optional.of("shuai");
        if (name.isPresent()) {
            System.out.println("有值啦");
        }

        Optional empty = Optional.ofNullable(null);

        // System.out.println(empty.get());
        // name.isPresent((value)->{
        //     System.out.println();
        // });

        // System.out.println(empty.orElse("there is no value!"));

        // System.out.println(name.orElse("there is some value!"));

        // System.out.println(empty.orElseGet(() -> "default value"));
        //
        // System.out.println(name.orElseGet(() -> "default value"));

        // Optional<String> upperName = name.map((value) -> value.toUpperCase());
        // System.out.println(upperName.orElse("No value found"))

        // Optional<String> upperName = name.flatMap((value) -> Optional.of(value.toUpperCase()));
        // System.out.println(upperName.orElse("No value found"));


    }
}