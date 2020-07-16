package com.ticketManage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ticketManage.api.service.ManageInforInterface;
import com.ticketManage.api.vo.ManageInforVo;
import com.ticketManage.service.impl.MangeInforImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/manageInfor")
public class ManageInforController {



//          @Resource(name = "mangerInforImpl")
        @Autowired
        MangeInforImpl mangeInforImpl;

        @RequestMapping("/findAllManage")
        @ResponseBody
        public List<ManageInforVo> findAllManage(){
                List<ManageInforVo> manageInforVoList=mangeInforImpl.findAllManage();
                System.out.println(manageInforVoList.size());
                return manageInforVoList;
        }

}