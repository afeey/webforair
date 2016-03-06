package com.gl.webforair.controller.view;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.webforair.core.po.HourAQI;
import com.gl.webforair.core.po.RealHourAQI;
import com.gl.webforair.core.service.IHourAQIService;
import com.gl.webforair.core.service.IRealHourAQIService;

/**
 * 主页控制器
 * 
 * @author afeey
 *
 */
@Controller
public class IndexController {

	//private static final Logger log = LoggerFactory.getLogger(IndexController.class);

	@RequestMapping("/")
	public String Index(Model model, HttpSession session) {
		return "index";
	}
	
	@Autowired
	private IHourAQIService hourAQIService;
	@Autowired
	private IRealHourAQIService realHourAQIService;

	/**
	 * HourAQI数据
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping("/HourAQI")
	public String hourAQI(Model model, HttpSession session) {
		List<HourAQI> dataList = hourAQIService.listAll();
		model.addAttribute("dataList", dataList);
		return "hour_aqi";
	}
	
	/**
	 * RealHourAQI数据
	 * 
	 * @param model
	 *            model
	 * @param session
	 *            Session
	 * @return view
	 */
	@RequestMapping("/RealHourAQI")
	public String ealHourAQI(Model model, HttpSession session) {

		List<RealHourAQI> dataList = realHourAQIService.listAll();
		model.addAttribute("dataList", dataList);

		return "real_hour_aqi";
	}
}
