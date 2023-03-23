package dev.be.moduleapi.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import dev.be.modulecommon.enums.CodeEnum;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL) // null 값인 필드를 제외하고 JSON 송출
public class CommonResponse<T> {

    private String returnCode;
    private String returnMessage;
    private T info; // 실제 응답값, response body 역할

    // CodeEnum 활용
    public CommonResponse(CodeEnum codeEnum) {
        setReturnCode(codeEnum.getCode());
        setReturnMessage(codeEnum.getMessage());
    }

    // 데이터 넣기
    public CommonResponse(T info) {
        setReturnCode(CodeEnum.SUCCESS.getCode());
        setReturnMessage(CodeEnum.SUCCESS.getMessage());
        setInfo(info);
    }

    public CommonResponse(CodeEnum codeEnum, T info) {
        setReturnCode(codeEnum.getCode());
        setReturnMessage(codeEnum.getMessage());
        setInfo(info);
    }

}
