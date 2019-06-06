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
@TableName("t_skill")
@Data
public class TSkill extends Model<TSkill> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "kid", type = IdType.AUTO)
    private Integer kid;
    private String keyword;
    private String kimg;
    private Integer fid;



}
