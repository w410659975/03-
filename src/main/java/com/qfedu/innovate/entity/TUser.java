package com.qfedu.innovate.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@TableName("t_user")
@Data
public class TUser extends Model<TUser> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;
    private String uname;
    private String sex;
    private String uaccount;
    private String upassword;
    private Integer integral;
    private Integer loginnum;
    private String state;
    private String uimg;



}
