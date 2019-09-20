package com.orte.pattern.adapter;

public class Main {
    public static void main(String[] args) {
        VectorAdapterFromRaster g1 = new VectorAdapterFromRaster();
        g1.drawLine();
        g1.drawSquare();
    }

}
interface VectorGraphicsInterface{
    void drawLine();
    void drawSquare();
}
class RasterGraphics{
    void drawRasterLine(){
        System.out.println("draw line");
    }
    void drawRasterSquare(){
        System.out.println("draw square");
    }
}
class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphicsInterface{
    public void drawLine(){
        drawRasterLine();
    }
    public void drawSquare(){
        drawRasterSquare();
    }
}
class VectorAdapterFromRaster2 implements VectorGraphicsInterface{
    RasterGraphics rasterGraphics = new RasterGraphics();

    @Override
    public void drawLine() {
        rasterGraphics.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        rasterGraphics.drawRasterSquare();
    }
}