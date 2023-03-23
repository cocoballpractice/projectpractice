package dev.be.modulecommon.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CommonDemoService {

    public String common() {
        return "common";
    }

}
