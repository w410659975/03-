package com.qfedu.innovate.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qfedu.innovate.entity.TMessage;
import com.qfedu.innovate.vo.Bean;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
public interface TMessageService extends IService<TMessage> {

    Bean addSingle(TMessage tMessage);

    Bean selectByid(int uid);

    Bean updateByTmessage(TMessage tMessage);
}











