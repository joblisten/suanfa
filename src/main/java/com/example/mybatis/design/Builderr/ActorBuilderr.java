package com.example.mybatis.design.Builderr;
/*
角色建造者
 */
public abstract class ActorBuilderr {
    protected Actor actor=new Actor();
    public abstract void builderstyle();
    public abstract void buildersex();
    public abstract void builderface();
    public abstract void builderhair();
    public Actor  creatActor(){
        return actor;
    }
}
