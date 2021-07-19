package com.corey.springbootcrudjpah2.service;

import com.corey.springbootcrudjpah2.util.StringTransUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilService {

    @Autowired
    StringTransUtil stringTransUtil;

    public String addString(String a, String b) {
        return stringTransUtil.addTwoString(a, b);
    }
}
