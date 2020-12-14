package ac.uk.bristol.cs.spe.livedemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @GetMapping(value = "/")
    public String index(@RequestParam String name, Model model){
        model.addAttribute("name", name);
        return "index";
    }

}
