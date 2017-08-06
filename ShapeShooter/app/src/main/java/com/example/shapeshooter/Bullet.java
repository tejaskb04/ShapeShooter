package com.example.shapeshooter;

public class Bullet {
    private double xPos;
    private double yPos;
    private double xVel;
    private double yVel;

    public Bullet(double xPos, double yPos, double xVel, double yVel) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.xVel = xVel;
        this.yVel = yVel;
    }
    public double getXPos() {
        return this.xPos;
    }
    public double getyPos() {
        return this.yPos;
    }
    public double getXVel() {
        return this.xVel;
    }
    public double getYVel() {
        return this.yVel;
    }
    public void setXPos(int x) {
        this.xPos = x;
    }
    public void setYPos(int x) {
        this.yPos = x;
    }
    public void setXVel(int x) {
        this.xVel = x;
    }
    public void setYVel(int x) {
        this.yVel = x;
    }
}
