package com.mashibing.tankFacade;

import java.awt.*;

public class Explode extends GameObject{
    public static int WIDTH = ResourceMgr.explodes[0].getWidth();//爆炸宽度高度
    public static int HEIGHT = ResourceMgr.explodes[0].getHeight();//爆炸宽度高度

    private int x,y;
    GameModel gm=null;
    private int step=0;

    public Explode(int x, int y, GameModel gm) {
        this.x = x;
        this.y = y;
        this.gm = gm;
//        new Audio("audio/explode.wav").run();
    }
    @Override
    public void paint(Graphics g){
        g.drawImage(ResourceMgr.explodes[step++],x,y,null);
        if(step >= ResourceMgr.explodes.length){
            gm.remove(this);
        }
    }
}
