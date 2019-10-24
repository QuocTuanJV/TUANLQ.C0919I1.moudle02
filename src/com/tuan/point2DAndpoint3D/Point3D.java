package com.tuan.point2DAndpoint3D;

public class Point3D extends Point2D {
    private float z = 0;
    public Point3D (){

    }

    public Point3D(float z){
        //super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{super.getX(),super.getY(),this.z};
    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x, y);
        this.getXYZ()[2] = z;
    }
    public String toString(){
        return "(" + super.getX() + "," + super.getY() + "," + this.getZ() + ")";
    }

}
