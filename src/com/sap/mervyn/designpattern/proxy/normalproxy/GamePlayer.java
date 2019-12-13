package com.sap.mervyn.designpattern.proxy.normalproxy;

public class GamePlayer implements IGamePlayer {
    private String name;

    public GamePlayer(IGamePlayer _gamePlayer, String name) throws Exception {
        if (_gamePlayer == null) {
            throw new Exception("can't create real game player!");
        }

        this.name = name;
    }

    @Override
    public void login(String userName, String password) {
        System.out.println("登录名为" + userName + "的用户" + this.name + "登陆成功！");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪！");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + "又升了一级！");
    }
}
