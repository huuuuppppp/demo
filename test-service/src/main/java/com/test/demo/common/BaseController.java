package com.test.demo.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseController {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 响应返回结果
     *
     * @param rows 影响行数
     * @return 操作结果
     */
    protected AjaxResult toAjax(int rows) {
        return rows > 0 ? success() : error();
    }

    /**
     * 响应返回结果
     *
     * @param result 结果
     * @return 操作结果
     */
    protected AjaxResult toAjax(boolean result) {
        return result ? success() : error();
    }

    /**
     * 登陆响应返回结果
     *
     * @param result 结果
     * @return 操作结果
     */
    protected AjaxResult toAjaxLogin(boolean result) {
        return result ? successLogin() : error();
    }

    /**
     * 登陆成功返回token
     *
     * @return 操作结果
     */
    private AjaxResult successLogin() {
        AjaxResult result = new AjaxResult(AjaxResult.Type.SUCCESS, "登陆成功");
        result.put("token", "admin-token");
        return result;
    }

    /**
     * 返回成功
     */
    public AjaxResult success() {
        return AjaxResult.success();
    }

    /**
     * 返回失败消息
     */
    public AjaxResult error() {
        return AjaxResult.error();
    }

    /**
     * 返回成功消息
     */
    public AjaxResult success(String message) {
        return AjaxResult.success(message);
    }

    /**
     * 返回成功数据
     */
    public static AjaxResult success(Object data) {
        return AjaxResult.success("操作成功", data);
    }

    /**
     * 返回失败消息
     */
    public AjaxResult error(String message) {
        return AjaxResult.error(message);
    }

    /**
     * 返回错误码消息
     */
    public AjaxResult error(AjaxResult.Type type, String message) {
        return new AjaxResult(type, message);
    }

}
