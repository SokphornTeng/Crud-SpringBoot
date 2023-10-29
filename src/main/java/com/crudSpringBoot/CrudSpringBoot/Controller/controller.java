package com.crudSpringBoot.CrudSpringBoot.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crudSpringBoot.CrudSpringBoot.Information.InforSokphorn;

@Controller
public class controller {
   
	private Map<String, InforSokphorn> inforSokphorn = new HashMap<>();
	
	public controller() {
		inforSokphorn.put("1", new InforSokphorn("1", "Sokphorn", "Web Developer", 25, "Woori Bank"));
		inforSokphorn.put("2", new InforSokphorn("2", "Tola", "Child Keeper", 27, "Phnom Phen"));
		inforSokphorn.put("3", new InforSokphorn("3", "Vuthe", "Student", 19, "School"));
		inforSokphorn.put("4", new InforSokphorn("4", "Soklin", "Tada Driver", 30, "Phnom Phen"));
		inforSokphorn.put("5", new InforSokphorn("5", "ChanPheap", "Farmer", 62, "Kampong Thom"));
		inforSokphorn.put("6", new InforSokphorn("6", "Navong", "Content Creator", 28, "Phnom Phen"));
		inforSokphorn.put("7", new InforSokphorn("7", "Dara", "Frontend", 26, "Village"));
		inforSokphorn.put("8", new InforSokphorn("8", "Davin", "Senior Officer", 24, "Seam Reap"));
	}
	
	
	@RequestMapping("/index")
	public String sokphornInfoListing(Model model) {
	    model.addAttribute("inforSokphorn", inforSokphorn.values());
		return "index";
	}
	
	@RequestMapping("/index/form")
	public String formInfo() {
		return "AddInfo";
	}
	
	@RequestMapping("/index/addData")
	public String addFill(Model mode, @ModelAttribute("insertData") InforSokphorn newData) {
		inforSokphorn.put(newData.getId(), newData);
		mode.addAttribute("inforSokphorn", inforSokphorn.values());
		return "index";
	}
	
	@RequestMapping("/index/edit/{id}")
	public String EditForm(Model model, @PathVariable("id") String editById) {
		model.addAttribute("editInfor", inforSokphorn.get(editById));
		return "EditForm";
	}
	
	@PostMapping("/index/edit/{id}")
	public String EditData(Model model, @PathVariable("id") String editById, @ModelAttribute("editInfor") InforSokphorn infor ) {
		inforSokphorn.put(editById, infor);
		model.addAttribute("inforSokphorn", inforSokphorn.values());
		return "index";
	}
	
	@GetMapping("/index/delete/{id}")
	public String deleteData(Model model, @PathVariable("id") String deleteInfo) {
		inforSokphorn.remove(deleteInfo);
		model.addAttribute("inforSokphorn", inforSokphorn.values());
		return "index";
	}
}
