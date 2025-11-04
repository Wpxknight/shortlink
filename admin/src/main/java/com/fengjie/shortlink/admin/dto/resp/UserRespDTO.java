package com.fengjie.shortlink.admin.dto.resp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fengjie.shortlink.admin.common.serialize.IdCardDesensitizationSerializer;
import com.fengjie.shortlink.admin.common.serialize.PhoneDesensitizationSerializer;

public class UserRespDTO {

    /**
     * id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 手机号
     */
    @JsonSerialize(using = PhoneDesensitizationSerializer.class)
    private String phone;

    /**
     * 邮箱
     */
    private String mail;
}
