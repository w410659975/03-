package com.qfedu.innovate.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qfedu.innovate.entity.TMessage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
public interface TMessageMapper extends BaseMapper<TMessage> {

    //添加
    @Insert("insert into t_message(IDcard,birth,address,phone,xdesc,unitname) values(#{IDcard},#{birth},#{address},#{phone},#{xdesc},#{unitname})")
    int insert(TMessage tMessage);

    //查询
    @Select("select x.IDcard,x.birth,x.address,x.phone,u.sex,x.xdesc from t_user u inner join t_message x on u.uid=x.uid=#{uid};")
    TMessage selectByxid(int uid);

    //更改
    @Update("update t_message set IDcard=#{IDcard},birth=#{birth},address=#{address},phone=#{phone},xdesc=#{xdesc},unitname=#{unitname} where xid=#{xid}")
    void updateTmessage(TMessage tMessage);
}



















