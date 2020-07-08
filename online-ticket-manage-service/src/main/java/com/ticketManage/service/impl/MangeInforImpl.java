package com.ticketManage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ticketManage.api.service.ManageInforInterface;
import com.ticketManage.api.vo.ManageInforVo;
import com.ticketManage.entity.ManageInfor;
import com.ticketManage.mapper.ManageInforMapper;
import com.ticketManage.utils.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

//与ssh不同，ssh；dao层的daoimpl：完成功能；service。借助mapper完成
@Service
public class MangeInforImpl  extends BaseService implements ManageInforInterface {


        @Autowired//内部通过ManageInforMapper和resource里的mapper .xml文件，和数据库建立连接，完成功能
         ManageInforMapper manageInforMapper;

        @Override
        public List<ManageInforVo> findAllManage() {
                List<ManageInfor> manageInforList=manageInforMapper.findAllManage();
                //与外部api沟通，传输数据，完功能
                List<ManageInforVo> manageInforVoList=transferObjectIgnoreCaseList(manageInforList,ManageInforVo.class);
                return manageInforVoList;
        }
}