package ra.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;

@Controller
public class HomeController {
    @Autowired
    private ServletContext context; // môi trường chạy
   @GetMapping("/home")
    public String home() {
        return "home";
    }
    @PostMapping("/upload")
    public String upload(@RequestParam("image") MultipartFile image, @RequestParam("audio") MultipartFile audio, Model model){
        // logic upload
        // lây ra  thư muc upload
        String uploadPath = context.getRealPath("/uploads");
        File file = new File(uploadPath);
        if (!file.exists()){
            file.mkdirs() ;  //tạo mới thu muc
        }
        String fileImageName = image.getOriginalFilename(); // lấy ra tên file
        // copy file ngưoi dùng gửi lên vào thư mục uploads
        try {
            FileCopyUtils.copy(image.getBytes(),new File(uploadPath+File.separator+fileImageName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        model.addAttribute("url",fileImageName);
        return "image";
    }
}

