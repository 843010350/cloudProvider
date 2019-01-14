package com.qfedu.cloudprovider.app;


import com.qfedu.cloudprovider.entity.Word;
import com.qfedu.cloudprovider.service.WordService;
import com.qfedu.cloudprovider.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/9/28 11:54
 */
@RestController
public class WordApp {
    @Autowired
    private WordService wordService;

    //新增
    @PostMapping(value = "/wordsave.do",produces = "text/plain;charset=utf-8")

    public R save1(@RequestBody Word word, HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");

        return wordService.save(word);
    }
    //查询
    @GetMapping(value = "/wordlist.do")
    public List<Word> list(int flag){
        return wordService.queryByFlag(flag);
    }
}
