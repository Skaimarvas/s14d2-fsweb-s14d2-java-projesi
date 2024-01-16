package com.workintech.composition;

public class Ceiling {
    private int height;
    private PaintColor paintedColor;

    public Ceiling(int height, PaintColor paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public PaintColor getPaintedColor() {
        return paintedColor;
    }

    public void setPaintedColor(PaintColor paintedColor) {
        this.paintedColor = paintedColor;
    }

    public void create(){
        System.out.println("Ceil Paint color: "+getPaintedColor());
        System.out.println("Ceil Height: " + getHeight());
    }
}
