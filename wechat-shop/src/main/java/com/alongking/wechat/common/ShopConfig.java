package com.alongking.wechat.common;

/**
 * Created by alongsea2 on 2017/1/11.
 */
public interface ShopConfig {

    String SUCCESS = "success";

    String ERROR = "error";

    String MUST_WECHAT = "mustWechat";

    String STATUS_YES = "Y";

    String STATUS_NO = "N";

    String SHOP_TITLE = "风尚美容美发微信商城";

    String OAUTH_URL = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=%s&redirect_uri=%s&response_type=code&scope=snsapi_userinfo&state=%s#wechat_redirect";

    String TOKEN_URL = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=%s&secret=%s&code=%s&grant_type=authorization_code";

    String REFRESH_TOKEN_URL = "https://api.weixin.qq.com/sns/oauth2/refresh_token?appid=%s&grant_type=refresh_token&refresh_token=%s";

    String USER_INFO_URL = "https://api.weixin.qq.com/sns/userinfo?access_token=%s&openid=%s&lang=zh_CN";

    String APP_ID = "";

    String APP_SECRET = "";

    String REDIECT_WECHAT = "redirectWechat";

    int PAGE_LIMIT = 3;

    int STORE_ID = 2;

    int SUCCESS_CODE = 1;

    int FAIL_CODE = 0;

    int ORDER_SUBMITTED = 10;                 // 针对货到付款而言，他的下一个状态是卖家已发货
    int ORDER_PENDING = 11;                   // 等待买家付款
    int ORDER_ACCEPTED = 20;                  // 买家已付款，等待卖家发货
    int ORDER_SHIPPED = 30;                   // 卖家已发货
    int ORDER_FINISHED = 40;                  // 交易成功
    int ORDER_CANCELED = 0;                   // 交易已取消

}
