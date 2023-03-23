package dev.be.moduleapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DemoService {

    public String save() {
        return "save";
    }

    public String find() {
        return "find";
    }

}
