package com.mmall.testController;

import com.google.common.collect.Maps;
import com.mmall.common.ServerResponse;
import com.mmall.service.IFileService;
import com.mmall.util.PropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class helloController {

    @Autowired
    private IFileService fileService;

    @RequestMapping("/hello")
    public String hello(){
        return "login";
    }

    @RequestMapping("/manage/file/upload")
    public ServerResponse uploadFile(@RequestParam(value = "upload_file",required = false) MultipartFile file, HttpServletRequest request){
        String path = request.getSession().getServletContext().getRealPath("upload");
        System.out.println("path = " +path);
        String targetFileName = fileService.upload(file, path);
        String url = PropertiesUtil.getProperty("ftp.server.http.prefix") + targetFileName;

        Map fileMap = Maps.newHashMap();
        fileMap.put("uri", targetFileName);
        fileMap.put("url", url);
        ServerResponse serverResponse = ServerResponse.createBySuccess(fileMap);
        return serverResponse;
    }

}
