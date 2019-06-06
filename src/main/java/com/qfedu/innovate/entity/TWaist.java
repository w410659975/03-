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
@TableName("t_waist")
@Data
public class TWaist extends Model<TWaist> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "wid", type = IdType.AUTO)
    private Integer wid;
    private String waccount;
    private String wpassword;
    private Date wtime;
    private Integer uid;



}
