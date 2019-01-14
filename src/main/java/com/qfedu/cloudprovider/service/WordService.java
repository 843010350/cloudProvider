package com.qfedu.cloudprovider.service;


import com.qfedu.cloudprovider.entity.Word;
import com.qfedu.cloudprovider.vo.R;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/9/28 11:50
 */
public interface WordService {

    R save(Word word);
    List<Word> queryByFlag(int f);
}
