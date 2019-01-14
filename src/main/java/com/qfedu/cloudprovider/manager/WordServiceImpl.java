package com.qfedu.cloudprovider.manager;


import com.qfedu.cloudprovider.entity.Word;
import com.qfedu.cloudprovider.mapper.WordMapper;
import com.qfedu.cloudprovider.service.WordService;
import com.qfedu.cloudprovider.vo.R;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/9/28 11:52
 */
@Service
public class WordServiceImpl implements WordService {
    @Resource
    private WordMapper wordMapper;

    @Override
    public R save(Word word) {
        if(wordMapper.insert(word)>0){
            return new R(200,"OK");
        }else {
            return new R(404,"ERROR");
        }
    }

    @Override
    public List<Word> queryByFlag(int f) {
        return wordMapper.selectAll(f);
    }
}
