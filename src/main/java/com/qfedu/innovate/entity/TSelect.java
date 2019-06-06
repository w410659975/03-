package com.qfedu.innovate.entity;


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
@TableName("t_select")
@Data
public class TSelect extends Model<TSelect> {

    private static final long serialVersionUID = 1L;

    private Integer lid;
    private String lname;
    private Integer qid;



}
