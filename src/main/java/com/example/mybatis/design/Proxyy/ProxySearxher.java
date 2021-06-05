package com.example.mybatis.design.Proxyy;
/*


 */
public class ProxySearxher  implements Searcher {
    Validatorr  validatorr;
    RealSearcher    realSearcher=new RealSearcher();//真实业务操作，类似在service中
    @Override
    public String Dosearch(String id, String password) {
       if(this.validat(id)){
           realSearcher.Dosearch(id,password);
       }

        return null;
    }

    public Boolean validat(String   id){
        validatorr=new Validatorr();
        return validatorr.vali(id);

    }
}

