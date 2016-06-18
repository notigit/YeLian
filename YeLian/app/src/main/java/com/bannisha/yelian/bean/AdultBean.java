package com.bannisha.yelian.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 成人实例
 * Created by Administrator on 2016/3/31.
 */
public class AdultBean implements Serializable{

    /**
     * ret : 0
     * data : [{"id":999,"channelId":1,"name":"老汉少妻亡人","keyword":"无码|剧情","isVip":true,"picUrl":"http://static.msgrl.com/image/598d324e4f6b5628.jpg","content":"<span style=\"color: rgb(51, 51, 51); font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; font-size: 14px; line-height: 24px; background-color: rgb(255, 255, 255);\">父亲，儿子和孙子三人，都对这个29岁的性感妈妈如醉如痴。永泰是一个垂死的癌症患者，他的妻子去世了。晟敏是一个儿子，是没有用的滋扰。永议员是永泰的孙子，沉迷于色情。一个性感的妈妈进入这三个人一天的生活。金熙带来积极的感受进了屋，并为三人规定她个人的治疗方法。谁就会得到它与妈妈？<\/span>"},{"id":998,"channelId":1,"name":"两天一夜","keyword":"激爱|剧情","isVip":false,"picUrl":"http://static.msgrl.com/image/552503d29c6a58e3.jpg","content":"当代最需要的19禁电影"},{"id":996,"channelId":1,"name":"肉体的欢愉","keyword":"极乐|剧情","isVip":false,"picUrl":"http://static.msgrl.com/image/18ac80cda3004e73.jpg","content":"催眠过程中，贤贞讲述了自己隐秘的过去，并开始表现出妖冶鬼魅的人格。禁不住诱惑，智勋利用催眠跨越禁区，全然不计任何后果"},{"id":977,"channelId":1,"name":"试衣间激战","keyword":"激情|未删","isVip":false,"picUrl":"http://static.msgrl.com/image/0c018cb7f2e3ce11.jpg","content":"男主是一个约19岁的男生，妈妈要出去然后让他寄住在朋友家里，那个女人身材很好，男生意淫，后来偶然发现女人和其他男人偷情，结果更加欲罢不能，一路跟着女人偷窥，发现女人还和一个男人在试衣间激战，上演三里屯剧情，后来，男人经不住诱惑和女人上了床。"},{"id":709,"channelId":1,"name":"恐怖施邪术","keyword":"无码|剧情","isVip":true,"picUrl":"http://static.msgrl.com/image/78b5cd3cef44451d.jpg","content":"将尸油，亲手擦在心仪对象的身上，那个人这辈子就会疯狂的爱上你，对你忠心\u2026\u2026宅宅工程师，深深迷恋美女同事-小兰，将手边的尸油，胡乱使用，倒入茶中让女同事喝，没想到开始出现怪异现象"},{"id":700,"channelId":1,"name":"赤×ピンク(日本)","keyword":"无码|剧情","isVip":true,"picUrl":"http://static.msgrl.com/image/287a7eb9c88dfef7.jpg","content":"<span style=\"color: rgb(50, 50, 50); font-family: SimSun; font-size: 12px; line-height: 20px; text-indent: 28px; background-color: rgb(255, 255, 255);\">六本木の廃校で夜ごと繰り広げられる非合法の格闘技ショー「ガールズブラッド」に身を投じる4人の少女たちが、鉄製の檻の中で裸の心と体をぶつけ合う姿を描く。<\/span>"},{"id":693,"channelId":1,"name":"我要车震","keyword":"车震|美胸","isVip":false,"picUrl":"http://static.msgrl.com/image/ae93549ad83a7f5c.jpg","content":"《我要车震》车震老少配干活不累"},{"id":684,"channelId":1,"name":"豆腐西施","keyword":"美貌|西施","isVip":true,"picUrl":"http://static.msgrl.com/image/08f649d3a142dc01.jpg","content":"美娇娘与狂野拳师"},{"id":681,"channelId":1,"name":"武士","keyword":"轻纱|美臀","isVip":true,"picUrl":"http://static.msgrl.com/image/3ca5ff37b9f103d4.jpg","content":"壮汉美女野地之欢"},{"id":672,"channelId":1,"name":"花和尚","keyword":"美女|和尚","isVip":true,"picUrl":"http://static.msgrl.com/image/cf66aa9e61eb7d5e.jpg","content":"淫僧强娶有夫之妇"}]
     */

    private int ret;
    /**
     * id : 999
     * channelId : 1
     * name : 老汉少妻亡人
     * keyword : 无码|剧情
     * isVip : true
     * picUrl : http://static.msgrl.com/image/598d324e4f6b5628.jpg
     * content : <span style="color: rgb(51, 51, 51); font-family: 'Helvetica Neue', Helvetica, Arial, sans-serif; font-size: 14px; line-height: 24px; background-color: rgb(255, 255, 255);">父亲，儿子和孙子三人，都对这个29岁的性感妈妈如醉如痴。永泰是一个垂死的癌症患者，他的妻子去世了。晟敏是一个儿子，是没有用的滋扰。永议员是永泰的孙子，沉迷于色情。一个性感的妈妈进入这三个人一天的生活。金熙带来积极的感受进了屋，并为三人规定她个人的治疗方法。谁就会得到它与妈妈？</span>
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
        //渠道ID
        private int channelId;
        private String name;
        //关键词
        private String keyword;
        private boolean isVip;
        private String picUrl;
        private String content;

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

        public void setContent(String content) {
            this.content = content;
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

        public String getContent() {
            return content;
        }
    }

    @Override
    public String toString() {
        return "AdultBean{" +
                "ret=" + ret +
                ", data=" + data +
                '}';
    }
}
