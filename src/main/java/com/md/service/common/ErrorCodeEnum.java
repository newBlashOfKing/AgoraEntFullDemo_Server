package com.md.service.common;

import lombok.Getter;

@Getter
public enum ErrorCodeEnum {

    system_error(10000, "系统异常，请稍后再试"),
    /**
     * 用户
     */
    phone_error(10001, "请输入正确的手机号"),
    code_repeat(10002, "请勿重复发送验证码"),
    no_code(10003, "请重新发送验证"),
    user_not_exist(10004, "用户不存在"),
    verification_code_sent_failure(10005, "验证码发送失败"),
    send_code_max(10006, "验证获取次数已达上限，请明天再试"),
    code_error(10007, "验证码不正确"),
    code_error_lock(10008, "请5分钟后再尝试"),

    /**
     * 房间
     */
    room_name_is_empty(20001,"房间名称为空"),
    password(20002,"私有房间请输出密码"),
    there_is_no_closed_room(20003,"存在未关闭的房间"),
    cannot_close_room(20004,"无法关闭房间"),
    songs_have_been_switch(20005,"歌曲已经被切了"),
    no_song(20006,"歌曲不存在"),
    no_room(20007,"房间不存在"),
    seat_was(20008,"座位上有人"),
    password_is_not_correct(20009,"密码不正确"),
    please_enter_password(20010,"请输入密码"),


    /**
     * 上传
     */
    upload_failed(90001,"上传图片失败"),

    /**
     * 请不要上传污秽内容
     */
    please_dont_upload_cmpurity_content(90002,"请不要上传污秽内容"),

    please_dont_upload_contains_politically_sensitive_content(90003,"请不要上传包含政治敏感内容"),




    ;
    private final Integer code;

    private final String message;

    ErrorCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
