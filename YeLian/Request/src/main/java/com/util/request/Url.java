package com.util.request;

/**
 * Created by tangchao on 2015/12/09.
 */
public abstract class Url {

    //    private static final String HOST = "http://2014.iwoodleaf.com:8095/api/";//服务器
    private static final String HOST = "http://cq196.cn:8095/api/";//杨成龙
//    private static final String HOST = "http://192.168.0.120:8095/api/";//袁贵权
    /**
     * 登录
     */
    public static final String LOGIN = HOST + "memberLogin.htm";
    /**
     * 欢迎页
     */
    public static final String LOGO = HOST + "getBootPage.htm";
    /**
     * 注册
     */
    public static final String REGISTER = HOST + "memberRregister.htm";
    /**
     * 首页广告列列表
     */
    public static final String ADV = HOST + "advertisementList.htm";
    /**
     * 平台订单人数
     */
    public static final String TERRACENUM = HOST + "getHomePageOrderCount.htm";
    /**
     * 优秀雇员
     */
    public static final String EXCELLENT = HOST + "excellentEmp.htm";
    /**
     * 广告详情
     */
    public static final String ADV_CENTEXT = HOST + "advertisementDetail.htm";
    /**
     * 个人中心
     */
    public static final String PERSONAGE = HOST + "memberPersonalCenter.htm";
    /**
     * 个人资料
     */
    public static final String DATA = HOST + "memberPersonalData.htm";
    /**
     * 上传个人资料
     */
    public static final String SETPERSONAGE = HOST + "memberModifyMyInformation.htm";
    /**
     * 技能列表查询
     */
    public static final String SKILLGET = HOST + "getIndustry.htm";
    /**
     * 技能数量设置
     */
    public static final String SKILLSET = HOST + "memberSSkillSet.htm";
    /**
     * 技能状态查询
     */
    public static final String SKILLAUTH = HOST + "memberGetAuthenticateIdCard.htm";
    /**
     * 技能状态查询1
     */
    public static final String SKILLGET1 = HOST + "memberSkillsCertification.htm";
    /**
     * 技能认证上传
     */
    public static final String SKillADD = HOST + "memberAuthenticationSkill.htm";
    /**
     * 等级列表
     */
    public static final String LV = HOST + "memberIntegralGradeList.htm";
    /**
     * 等级列表
     */
    public static final String LVGET = HOST + "memberIntegralGrade.htm";
    /**
     * 成为会员
     */
    public static final String P_M = HOST + "memberAaborContractor.htm";
    /**
     * 会员续费/付费订单
     */
    public static final String PMORDER = HOST + "becomeContractor.htm";
    /**
     * 雇主保障信息获取
     */
    public static final String SAFEGU = HOST + "getEmerPromise.htm";
    /**
     * 会员支付，雇主保障支付
     */
    public static final String PAY = HOST + "becomeContractor.htm";
    /**
     * 我的关注
     */
    public static final String MYATTENTION = HOST + "memberAttention.htm";
    /**
     * 我的拍档
     */
    public static final String MYPARTNER = HOST + "memberPartner.htm";
    /**
     * 我的拍档
     */
    public static final String ADDPARTHER = HOST + "addpartner.htm";
    /**
     * 估计价格
     */
    public static final String PLATFORMBUDGET = HOST + "getPlatformBudget.htm";
    /**
     * 估计价格
     */
    public static final String ISSUER = HOST + "memberReleaseDemand.htm";
    /**
     * 抢单列表
     */
    public static final String ORDERGET = HOST + "getGrablist.htm";
    /**
     * 抢单详情
     */
    public static final String ORDERGETDATA = HOST + "getReleaseDemandDetail.htm";
    /**
     * 用户抢单
     */
    public static final String ORDERGETDATA_BUTTON = HOST + "memberGrabaSingle.htm";
    /**
     * 我要展示
     */
    public static final String MYSHOW = HOST + "myExhibitionMailOrMarketOrLogistics.htm";
    /**
     * 列表的中师傅小工
     * 我要抢单/选择搭档
     */
    public static final String GETMASTERWORKE = HOST + "masterOrWorker.htm";
    /**
     * 现金信息查询
     */
    public static final String MONEYGET = HOST + "cashAccount.htm";
    /**
     * 提现
     */
    public static final String BACK = HOST + "memberWithdrawals.htm";
    /**
     * 雇主竞标中列表
     */
    public static final String BOSSRUNFOR = HOST + "memberOrderBiddingEmployerlist.htm";
    /**
     * 雇员竞标中列表
     */
    public static final String WORKRUNFOR = HOST + "emBidOrderInfo.htm";
    /**
     * 雇主竞标订单取消
     */
    public static final String BOSSRUNFORDELET = HOST + "getCancelReleasedemandOrder.htm";
    /**
     * 雇员竞标订单取消
     */
    public static final String WORKRUNFORDELET = HOST + "bidDelete.htm";
    /**
     * 雇员订单开工
     */
    public static final String WORKOREDRBUTTON1 = HOST + "getStartWork.htm";
    /**
     * 雇员订单结工
     */
    public static final String WORKOREDRBUTTON2 = HOST + "getEndWork.htm";
    /**
     * 雇主待验收，工作中，完成
     */
    public static final String BOSSORDERTYPE = HOST + "memberOrderStatuslist.htm";
    /**
     * 雇员待验收，工作中，完成
     */
    public static final String WORKOrderStatusdetails = HOST + "emOrderInfo.htm";
    /**
     * 雇主订单评价
     */
    public static final String BOSSEVALUTE = HOST + "masterEvaluateListList.htm";
    /**
     * 雇员订单待评价
     */
    public static final String WORKEVALUTE = HOST + "emEvaluateList.htm";
    /**
     * 雇主竞标中详情
     */
    public static final String BOSSCONTEND = HOST + "bidOrderInfo.htm";
    /**
     * 雇员竞标中详情
     */
    public static final String WORKEMORDER = HOST + "emBidDetail.htm";
    /**
     * 雇员订单详情
     */
    public static final String WORKERORDERCENTEXT = HOST + "emOrderDetail.htm";
    /**
     * 雇主提交评价
     */
    public static final String BOSSEvaluate = HOST + "comment.htm";
    /**
     * 雇主工作中，待验收。完成订单详情
     */
    public static final String BOSSODRERAUTHCENTEXT = HOST + "orderDetail.htm";
    /**
     * 雇主工作中
     */
    public static final String BOSSEM = HOST + "getChoiceEm.htm";
    /**
     * 雇主验收
     */
    public static final String TAKE = HOST + "getAcceptance.htm";
    /**
     * 法律条款
     */
    public static final String LAW = HOST + "getLegalProvisions.htm";
    /**
     * 帮助
     */
    public static final String HELP = HOST + "getUsersybz.htm";
    /**
     * 保密协议
     */
    public static final String AGRREEMENT = HOST + "getUserysxy.htm";
    /**
     * 管理制度
     */
    public static final String GUANLI = HOST + "getManagementSystem.htm";
    /**
     * 关于我们
     */
    public static final String GUANYU = HOST + "getAboutus.htm";
    /**
     * 协议内容
     */
    public static final String AGREEMENT = HOST + "getUserRetxieyi.htm";
    /**
     * 意见反馈
     */
    public static final String FEEDBACK = HOST + "memberFeedback.htm";
    /**
     * 服务商城
     */
    public static final String SHOPPIING = HOST + "getMailList.htm";
    /**
     * 货运物流
     */
    public static final String LOGISTIC = HOST + "getLogisticsList.htm";
    /**
     * 租凭市场
     */
    public static final String BAZAAR = HOST + "getMarketList.htm";
    /**
     * 个人详情
     */
    public static final String PERSOAGE_CEDNTEXT = HOST + "memberinfo.htm";
    /**
     * 个人详情评论列表
     */
    public static final String PERSOAGE_CEDNTEXT_EVALUATE = HOST + "personalInfoComment.htm";
    /**
     * 添加关注
     */
    public static final String ADDATTENION = HOST + "addattention.htm";
    /**
     * 取消关注
     */
    public static final String DELETEATTENION = HOST + "cancelattention.htm";
    /**
     * 取消关注
     */
    public static final String CITYGET = HOST + "getcity.htm";
    /**
     * 消息列表
     */
    public static final String NEWS = HOST + "memberMyMessage.htm";
    /**
     * 是否有消息
     */
    public static final String NEWSGET = HOST + "getMemeberisUserNowMessage.htm";
    /**
     * 消息已阅读
     */
    public static final String NEWSSET = HOST + "readingAllmessage.htm";
    /**
     * 消息删除
     */
    public static final String NEWSDELETER = HOST + "deleteMyMessage.htm";
    /**
     * 发送验证码
     */
    public static final String SEND = HOST + "sendCode.htm";
    /**
     * 校正验证码
     */
    public static final String SENDGET = HOST + "checkCode.htm";
    /**
     * 雇他
     */
    public static final String GUTA = HOST + "getChoiceEm.htm";
    /**
     * 支付宝回调接口
     */
    public static final String ZHIFUBAOPAY = HOST + "alipayNotify.htm";
    /**
     * 支付宝回调接口
     */
    public static final String GETMAP = HOST + "getNearByPosition.htm";
    /**
     * 订单投诉
     */
    public static final String COMPLAIN = HOST + "complain.htm";
    /**
     * 实名认证
     */
    public static final String SETIDCARD = HOST + "memberAuthenticateIdCard.htm";
    /**
     * 查询实名认证信息
     */
    public static final String GETIDCARD = HOST + "memberGetAuthenticateIdCard.htm";
    /**
     * 获取分享内容
     */
    public static final String FENXIANG = HOST + "memberSharecontent.htm";
    /**
     * 服务商城
     */
    public static final String SEEK = HOST + "getSearchPartner.htm";
    /**
     * 修改密码
     */
    public static final String SETPWS = HOST + "memberModifyPassword.htm";

}
