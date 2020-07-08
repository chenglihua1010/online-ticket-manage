package com.ticketManage.api.vo;

import java.io.Serializable;

public class ManageInforVo implements Serializable{
        //主键 id
        private Integer id;
        //管理员账号
        private String manageAccountId;
        //管理员密码
        private String managePassword;
        //管理员权限
        private String manageType;


        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getManageAccountId() {
                return manageAccountId;
        }

        public void setManageAccountId(String manageAccountId) {
                this.manageAccountId = manageAccountId;
        }

        public String getManagePassword() {
                return managePassword;
        }

        public void setManagePassword(String managePassword) {
                this.managePassword = managePassword;
        }

        public String getManageType() {
                return manageType;
        }

        public void setManageType(String manageType) {
                this.manageType = manageType;
        }
}