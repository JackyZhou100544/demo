package com.example.test;

/**
 * Created by ZHOUYAO on 2018/4/21.
 */
public class CodeMsg {
    private int retCode;//按照模块定义CodeMsg
    private String  message;
    //通用异常
    public static CodeMsg SUCCESS = new CodeMsg(0,"success");
    public  static CodeMsg SERVICE_EXCEPTION = new CodeMsg(500100,"服务端异常");
    public  static CodeMsg PARAMETER_ISNULL = new CodeMsg(500101,"输入参数为空");
    public  static CodeMsg USER_NOT_EXSIST = new CodeMsg(500102,"用户不存在");
    public static CodeMsg ONLINE_USER_OVER = new  CodeMsg(500103,"在线用户数超过允许登录最大限度");
    public  static CodeMsg SESSIOB_NOT_EXSIST = new CodeMsg(500104,"不存在离线session数据");
    public  static CodeMsg NOT_FIND_DATA = new CodeMsg(500105,"查找不到对应数据");
    public CodeMsg(int i, String success) {
        this.retCode=i;
        this.message=success;
    }

    public String getMessage() {
        return message;
    }

    public int getRetCode() {

        return retCode;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
