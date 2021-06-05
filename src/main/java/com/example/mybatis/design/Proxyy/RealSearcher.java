package com.example.mybatis.design.Proxyy;
/*
查询之前需要验证
 */
public class RealSearcher implements Searcher {
    @Override
    public String Dosearch(String id, String password) {
        System.out.printf(id+"查询成功");
        return "id";
    }
}
