
package com.weic.amya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Type:Week
 * @Desc: TODO
 * @Author:weic
 * @date:20/7/16 16:30
 */
@RestController
public class Week {
    @RequestMapping("/week")
    public ModelAndView week() {
        ModelAndView modelAndView = new ModelAndView();
        Map<String, Object> contentMap = new HashMap<>();
        contentMap.put("reportDate",new Date());
        contentMap.put("coveUsers",1);
        contentMap.put("coverRatioIce","1.0%");
        contentMap.put("buildGroupNum",2);
        contentMap.put("groupBuildRatioIce","1.0%");
        contentMap.put("inGroupNum",1);
        contentMap.put("inGroupRatioIce","1.0%");
        contentMap.put("newInGroupNum",1);
        contentMap.put("kickOutNum",1);
        contentMap.put("groupUserNum",1);
        contentMap.put("groupBuildRatioIce","1.0%");
        contentMap.put("descUserNum",1);


        modelAndView.addAllObjects(contentMap);
        modelAndView.setViewName("weekReport");
        return modelAndView;
    }
}
