package com.hugai.modules.statistics.controller;

import com.hugai.common.constants.ApiPrefixConstant;
import com.hugai.modules.statistics.entity.vo.DeskStatisticsDataVO;
import com.hugai.modules.statistics.entity.vo.UserSessionStatisticsDataVO;
import com.hugai.modules.statistics.service.StatisticsService;
import com.org.bebas.utils.result.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WuHao
 * @since 2023/8/10 15:37
 */
@RequiredArgsConstructor
@RestController
@RequestMapping(ApiPrefixConstant.Modules.STATISTICS)
public class StatisticsController {

    private final StatisticsService service;

    @GetMapping("/getUserDeskInfo")
    public Result getUserDeskInfo() {
        DeskStatisticsDataVO deskCommonData = service.getDeskCommonData();
        UserSessionStatisticsDataVO userSessionStatisticsData = new UserSessionStatisticsDataVO();
        try {
            userSessionStatisticsData = service.getUserSessionStatisticsData();
        } catch (Exception ignored) {}
        return Result.success()
                .put("deskCommonData",deskCommonData)
                .put("userSessionStatisticsData",userSessionStatisticsData)
                ;
    }

}
