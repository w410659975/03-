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
@TableName("t_information")
@Data
public class TInformation extends Model<TInformation> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "fid", type = IdType.AUTO)
    private Integer fid;
    private String fname;
    private String fcontent;
    private Date fputtime;
    private Integer looknum;
    private Integer replynum;
    private String fbrief;
    private Integer uid;
    private Integer mid;
    private Integer tid;


}
