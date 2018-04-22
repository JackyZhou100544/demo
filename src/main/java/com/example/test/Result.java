package com.example.test;

/**
 * Created by ZHOUYAO on 2018/4/21.
 */
public class Result<T> {
    private String  message;
    private int  retCode;
    private T data;
    private Result(T data){
       this.retCode = 0;
       this.message =  "成功";
       this.data = data;
    }
    private Result(CodeMsg cm){
         if(cm==null){
             return;
         }
         this.message = cm.getMessage();
         this.retCode = cm.getRetCode();
    }

    /**
     *成功时调用
     * @return
     *
     * */
    public static <T> Result<T> success(T data){
         return new Result<T>(data);
    }
    /**
     *成功，不需要传入参数
     * @return
     *
     * */
    public  static <T> Result<T> success(){
        return (Result<T>)success("");
    }

    /**
     * 失败时候的调用
     * @return
     * */
    public  static <T> Result<T> error(CodeMsg cm){
        return new Result<T>(cm);
    }

    /**
     *
     * 失败时候的调用，扩展消息参数
     * @param cm
     * @param msg
     * @return
     *
     * */
    public static <T> Result<T> error(CodeMsg cm,String msg){
             cm.setMessage(cm.getMessage()+"---"+msg);
             return new Result<T>(cm);
    }

    public String getMessage() {
        return message;
    }

    public int getRetCode() {
        return retCode;
    }

    public T getData() {
        return data;
    }
}
