package jp.co.systena.tigerscave.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShoppingController {
    
 
  @GetMapping("/shopping")
  public String hello(Model model) {

      model.addAttribute("title", "商品一覧");
      model.addAttribute("msg1", "キーボード"); 
      model.addAttribute("msg2", "価格 1000円");
      model.addAttribute("msg3", "ノートパソコン");
      model.addAttribute("msg4", "価格 100000円");
      model.addAttribute("msg5", "マウス");
      model.addAttribute("msg6", "価格 300円");
      
      return "shopping";
  }
}
