package com.qfedu.innovate.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@TableName("t_message")
@Data
public class TMessage extends Model<TMessage> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "xid", type = IdType.AUTO)
    private Integer xid;
    private String IDcard;
    private Date birth;
    private String address;
    private String phone;
    private String xdesc;
    private Integer uid;
    private String unitname;
    private Integer nid;
    private Integer wid;



}
