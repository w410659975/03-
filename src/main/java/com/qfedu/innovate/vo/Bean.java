package com.qfedu.innovate.vo;

import lombok.Data;

@Data
public class Bean {
    private int code;
    private String msg;
    private Object data;

    public static Bean setOK(){
        Bean bean = new Bean();
        bean.setCode(1);
        bean.setMsg("OK");
        bean.setData(null);
        return bean;
    }

    public static Bean setOK(String msg, Object data){
        Bean bean = new Bean();
        bean.setCode(1);
        bean.setMsg(msg);
        bean.setData(data);
        return bean;
    }

    public static Bean setError(){
        Bean bean = new Bean();
        bean.setCode(0);
        bean.setMsg("ERROR");
        bean.setData(null);
        return bean;
    }
}
