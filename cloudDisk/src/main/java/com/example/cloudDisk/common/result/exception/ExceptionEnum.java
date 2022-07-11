package com.example.cloudDisk.common.result.exception;

import lombok.Getter;

/**
 * @author 成大事
 * @since 2022/6/13 21:36
 */
public enum ExceptionEnum{
    // 数据操作错误定义
    SUCCESS("2000", "成功!"),
    BODY_NOT_MATCH("4000","请求的数据格式不符!"),
    SIGNATURE_NOT_MATCH("4001","请求的数字签名不匹配!"),
    NOT_FOUND("4004", "未找到该资源!"),
    INTERNAL_SERVER_ERROR("5000", "服务器内部错误!"),
    CONSTRAINT_VIOLATION_EXCEPTION("5002", "参数格式不合规!"),

    SERVER_BUSY("5003","服务器正忙，请稍后再试!");



    /**自定义错误码*/
    @Getter
    private final String resultCode;

    /**
     * 错误描述
     */
    @Getter
    private final String resultMsg;


    ExceptionEnum(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

}
