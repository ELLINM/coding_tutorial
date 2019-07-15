//GuestbookController
package com.test.web.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.web.service.GuestbookService;
import com.test.web.vo.GuestbookVO;

@Controller
@RequestMapping("/guestbook")
public class GuestbookController {
	
	@Autowired
	private GuestbookService service;
	
	// 방명록 리스트 화면 이동
	@RequestMapping(value = "guestbookList", method = RequestMethod.GET)
	public String guestbookList(Model model) {
		ArrayList<GuestbookVO> list = service.guestbookList();
		model.addAttribute("list", list);
		return "/guestbook/guestbookList";
	}
	
	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public String delete(GuestbookVO vo) {
		service.delete(vo);
		return "redirect:/guestbook/guestbookList";
	}
	
	@RequestMapping(value = "write", method = RequestMethod.POST)
	public String write(GuestbookVO vo) {
		service.write(vo);
		return "redirect:/guestbook/guestbookList";
	}
	
	
}