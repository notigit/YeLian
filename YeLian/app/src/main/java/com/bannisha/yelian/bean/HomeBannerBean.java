package com.bannisha.yelian.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/3/31.
 */
public class HomeBannerBean implements Serializable {

    /**
     * ret : 0
     * data : [{"id":320,"channelId":1,"name":"朝版色即是空","isVip":false,"picUrl":"http://static.msgrl.com/image/8caa56f46321a58b.jpg"},{"id":88,"channelId":4,"name":"あっきー纯恋","isVip":false,"picUrl":"http://static.msgrl.com/image/0152e531af656e54.jpg"},{"id":977,"channelId":1,"name":"试衣间激战","isVip":false,"picUrl":"http://static.msgrl.com/image/0c018cb7f2e3ce11.jpg"},{"id":36,"channelId":1,"name":"只是性","isVip":true,"picUrl":"http://static.msgrl.com/image/a81827eea92f2655.jpg"},{"id":999,"channelId":1,"name":"老汉少妻亡人","isVip":true,"picUrl":"http://static.msgrl.com/image/598d324e4f6b5628.jpg"}]
     */

    private int ret;
    /**
     * id : 320
     * channelId : 1
     * name : 朝版色即是空
     * isVip : false
     * picUrl : http://static.msgrl.com/image/8caa56f46321a58b.jpg
     */

    private List<DataEntity> data;

    public void setRet(int ret) {
        this.ret = ret;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public int getRet() {
        return ret;
    }

    public List<DataEntity> getData() {
        return data;
    }

    public static class DataEntity {
        private int id;
        private int channelId;
        private String name;
        private boolean isVip;
        private String picUrl;

        public void setId(int id) {
            this.id = id;
        }

        public void setChannelId(int channelId) {
            this.channelId = channelId;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setIsVip(boolean isVip) {
            this.isVip = isVip;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public int getId() {
            return id;
        }

        public int getChannelId() {
            return channelId;
        }

        public String getName() {
            return name;
        }

        public boolean isIsVip() {
            return isVip;
        }

        public String getPicUrl() {
            return picUrl;
        }
    }
}
