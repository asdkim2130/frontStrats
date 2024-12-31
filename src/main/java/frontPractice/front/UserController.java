package frontPractice.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String mainPage(){
        return "index";  //html 파일 이름 넣기
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String login(LoginRequest request){  //Dto
        System.out.println("request" + request);

        //사용자 로그인 아이디와 비밀번호 검증

        return "redirect:/";
    }



}
