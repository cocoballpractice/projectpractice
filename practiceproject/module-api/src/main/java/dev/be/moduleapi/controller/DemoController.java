package dev.be.moduleapi.controller;

import dev.be.moduleapi.service.DemoService;
import dev.be.modulecommon.enums.CodeEnum;
import dev.be.modulecommon.service.CommonDemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class DemoController {

    private final CommonDemoService commonDemoService; // common 모듈에 등록한 빈

    private final DemoService demoService;

    @GetMapping("/save")
    public String save() {
        System.out.println(CodeEnum.SUCCESS.getCode()); // common 모듈에 정의한 enum
        System.out.println(commonDemoService.common());
        return demoService.save();
    }

    @GetMapping("/find")
    public String find() {
        return demoService.find();
    }

}
