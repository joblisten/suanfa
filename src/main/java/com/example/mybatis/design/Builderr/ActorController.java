package com.example.mybatis.design.Builderr;

public class ActorController {

    public Actor  cons(ActorBuilderr  actorBuilderr){
        Actor  actor;
        actorBuilderr.builderface();
        actorBuilderr.builderhair();
        actorBuilderr.buildersex();
        actorBuilderr.builderstyle();
        actor=actorBuilderr.creatActor();
        return actor;
    }
}
