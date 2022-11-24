package com.jphome.system.controller;

import com.ruoyi.common.core.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

/**
 * AgentController
 * 
 * @author Jpanda
 * @date 2022-11-12
 */
@Controller
@RequestMapping("/agent")
public class AgentController extends BaseController {
    private String prefix = "agent";

    @GetMapping("/discover")
    public String discover() throws Exception {

        return "agent/discover";
    }
    @GetMapping("/keeped")
    public String keeped() throws Exception {

        return "agent/keeped";
    }
    @GetMapping("/manage")
    public String test(Model model) throws Exception {
        List<Map<String, Object>> sharehouseList = new ArrayList<>();
        Map<String, Object> item = new HashMap<>();
        item.put("ownerImage","@{/img/head.jpg}");
        item.put("ownerName","刘建");
        item.put("ownerId",1);
        item.put("agentName","张三");
        item.put("agentId",2);
        item.put("sharehouseId",3);
        item.put("emptyRoomCnt",0);
        item.put("emptyPlanRoomCnt",1);
        item.put("rentStart",30000);
        item.put("rentEnd",50000);
        item.put("sharehouseAddress","横滨三河里");
        item.put("route01","route01");
        item.put("station01","station01");
        item.put("walking01",2);
        item.put("route02","route02");
        item.put("station02","station02");
        item.put("walking02",1);
        item.put("womenOnly",true);
        item.put("sharehouseImage","a,b,c,d,e,f,g,h,i");
        item.put("roomBedDateModified","2022-08-15 05:00");
        sharehouseList.add(item);
        Map<String, String> agent = new HashMap<>();
        agent.put("userId","1");
        Map<String, String> useCase = new HashMap<>();
        useCase.put("name","AGENT");
        model.addAttribute("sharehouseList",sharehouseList);
        model.addAttribute("agent",agent);
        model.addAttribute("useCase",useCase);
        model.addAttribute("imgs", Arrays.asList(new String[]{"a","a","a","a","a","a","a","a","a"}));
        return "agent/agent-discover";
    }
}
