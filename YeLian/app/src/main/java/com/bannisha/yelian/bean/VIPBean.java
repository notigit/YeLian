package com.bannisha.yelian.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/3/31.
 */
public class VIPBean implements Serializable {

    /**
     * ret : 0
     * data : [{"id":999,"channelId":1,"name":"老汉少妻亡人","keyword":"无码|剧情","isVip":true,"picUrl":"http://static.msgrl.com/image/xdy0008-vip.jpg"},{"id":995,"channelId":5,"name":"嘘!禁止想象","keyword":"喜剧|成人","isVip":true,"picUrl":"http://static.msgrl.com/image/0fd10a8771afaca4.jpg"},{"id":994,"channelId":5,"name":"性瘾者(欧美)","keyword":"剧情|未删","isVip":true,"picUrl":"http://static.msgrl.com/image/6a849959faf57e92.jpg"},{"id":709,"channelId":1,"name":"恐怖施邪术","keyword":"无码|剧情","isVip":true,"picUrl":"http://static.msgrl.com/image/xdy0009-vip.jpg"},{"id":689,"channelId":3,"name":"迷人的保姆","keyword":"大赞|床戏","isVip":true,"picUrl":"http://static.msgrl.com/image/ec09fde8be0144d8.jpg"},{"id":970,"channelId":2,"name":"美少女被狂虐","keyword":"狂虐|少女","isVip":true,"picUrl":"http://static.msgrl.com/image/b70843a99c634560.jpg"},{"id":624,"channelId":1,"name":"床上关系","keyword":"","isVip":true,"picUrl":"http://static.msgrl.com/image/b21ca7bfa734c943.jpg"},{"id":461,"channelId":1,"name":"三角关系","keyword":"美女|诱惑","isVip":true,"picUrl":"http://static.msgrl.com/image/c350a944eb8079d7.jpg"},{"id":267,"channelId":1,"name":"秘书情人","keyword":"无码|激情","isVip":true,"picUrl":"http://static.msgrl.com/image/c05651c858fda628.jpg"},{"id":200,"channelId":6,"name":"秘密爱","keyword":"剧情|未删","isVip":true,"picUrl":"http://static.msgrl.com/image/d0d2efe7e43df03d.jpg"}]
     */

    private int ret;
    /**
     * id : 999
     * channelId : 1
     * name : 老汉少妻亡人
     * keyword : 无码|剧情
     * isVip : true
     * picUrl : http://static.msgrl.com/image/xdy0008-vip.jpg
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
        private String keyword;
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

        public void setKeyword(String keyword) {
            this.keyword = keyword;
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

        public String getKeyword() {
            return keyword;
        }

        public boolean isIsVip() {
            return isVip;
        }

        public String getPicUrl() {
            return picUrl;
        }
    }
}
