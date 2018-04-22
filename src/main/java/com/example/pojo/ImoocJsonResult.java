package com.example.pojo;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by ZHOUYAO on 2018/4/12.
 *
 *
 */
public class ImoocJsonResult{
//定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();
    //响应业务状态
    private Integer status;

    //响应消息
    private String msg;

    //响应中的数据
    private Object data;

    private String ok;


        public ImoocJsonResult(Integer status, String msg, Object data) {
            this.status = status;
            this.msg = msg;
            this.data = data;
        }


        public  static ImoocJsonResult build(Integer status, String msg, Object data){
            return new ImoocJsonResult(status, msg, data);
        }

        public static ImoocJsonResult ok(Object data){
            return new ImoocJsonResult(data);
        }
        public static ImoocJsonResult ok() {
           return new ImoocJsonResult(null);
        }
        public  static ImoocJsonResult errorMsg(String msg) {
           return new ImoocJsonResult(500,msg,null);
        }

        public static ImoocJsonResult errorMap(Object data) {
          return new ImoocJsonResult(501,"error",data);
        }

        public static ImoocJsonResult errorTokenMsg(String msg) {
         return new ImoocJsonResult(502,msg,null);
        }
        public  static ImoocJsonResult errorException(String msg) {
         return new ImoocJsonResult(555,msg,null);
        }
        public ImoocJsonResult(Object data) {
             this.status = 200;
             this.msg = "OK";
             this.data = data;
        }

        public String getMsg() {
            return msg;
        }

        public Object getData() {
            return data;
        }

        public String getOk() {
            return ok;
        }

        public Boolean isOK() {
        return this.status == 200;
        }


        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public void setOk(String ok) {
            this.ok = ok;
        }
}
