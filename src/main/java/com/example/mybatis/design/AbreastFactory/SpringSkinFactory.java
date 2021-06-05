package com.example.mybatis.design.AbreastFactory;

public class SpringSkinFactory  implements SkinFactory {
    @Override
    public Button creatButton() {
        return new SpringButton();
    }

    @Override
    public Text creatText() {
        return new SpringText();
    }
}
