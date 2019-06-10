package com.qfedu.innovate.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qfedu.innovate.entity.TMessage;
import com.qfedu.innovate.mapper.TMessageMapper;
import com.qfedu.innovate.service.TMessageService;
import com.qfedu.innovate.vo.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Feri
 * @since 2019-06-06
 */
@Service
public class TMessageServiceImpl extends ServiceImpl<TMessageMapper, TMessage> implements TMessageService {

    @Autowired
    private TMessageMapper tMessageMapper;

    @Override
    public Bean selectByid(int uid) {
        Bean result = new Bean();
        if (uid != 0) {
            result.setCode(0);
            result.setMsg("查询成功");
            result.setData(tMessageMapper.selectByxid(uid));
        } else {
            result.setCode(1);
            result.setMsg("查询失败");
        }
        return result;
    }

    @Override
    public Bean updateByTmessage(TMessage tMessage) {
//        TMessage message = new TMessage();
//        if (message.getClass().equals(tMessage)) {
//            return Bean.setOK();
//        } else {
//            return Bean.setError();
//        }
        return Bean.setOK();
    }


    @Override
    public Bean addSingle(TMessage tMessage) {
        if (tMessageMapper.insert(tMessage) > 0) {
            return Bean.setOK();
        } else {
            return Bean.setError();
        }
    }

}












