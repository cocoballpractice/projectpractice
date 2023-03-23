package dev.be.modulecommon.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CodeEnum {
    SUCCESS("0000", "성공"),
    UNKNOWN_ERROR("9999", "알 수 없는 에러");

    private String code;
    private String message;
}
