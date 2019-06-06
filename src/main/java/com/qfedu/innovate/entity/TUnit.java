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
@TableName("t_unit")
@Data
public class TUnit extends Model<TUnit> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "nid", type = IdType.AUTO)
    private Integer nid;
    private String uname;
    private Integer uid;



}
