package com.game.main;

import com.game.view.Window;

import javax.swing.*;
import java.awt.*;

public class GameMain {
    public static void main(String[] args) {
        Window win = new Window();
        win.initView();
        win.setTitle("Lucky2048");
        win.getContentPane().setPreferredSize(new Dimension(400, 500));
        //JFrame直接调用setBackground设置背景色不生效
        win.getContentPane().setBackground(new Color(0xfaf8ef));
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setResizable(false); //去掉最大化按钮
        win.pack();    //获得最佳大小
        win.setVisible(true);
    }
}
