package com.leyou.item.controller;

import com.leyou.common.domain.PageView;
import com.leyou.common.utils.StringUtil;

/**
 * ClassName:  <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date:   <br/>
 *
 * @author
 * @since JDK 1.6
 */
public class BaseController
{
    public PageView pageView = null;

    /**
     * 获取pageview信息
     * @param pageNow
     * @param pageSize
     * @param orderby
     * @return
     */
    public PageView getPageView(String pageNow, String pageSize, String orderby) {
        if (StringUtil.isEmpty(pageNow)) {
            pageView = new PageView(1);
        } else {
            pageView = new PageView(Integer.parseInt(pageNow));
        }
        if (StringUtil.isEmpty(pageSize)) {
            pageSize = "10";
        }
        pageView.setPageSize(Integer.parseInt(pageSize));
        pageView.setOrderby(orderby);
        return pageView;
    }
}
