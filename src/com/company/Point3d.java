package com.company;

public class Point3d  extends Point2d{
    // координата Z
    private double zCoord;

    //  Конструктор инициализации
    public Point3d(double x, double y, double z){
        setX(x);
        setY(y);
        setZ(z);
    }

    public Point3d(double Coord){
        setX(Coord);
        setY(Coord);
        setZ(Coord);
    }

    //  Возвращение координаты
    public double getZ () {

        return zCoord;
    }

    //Установка значения координаты Z
    public void setZ(double val) {

        zCoord = val;
    }

    //Конструктор по умолчанию.
    public Point3d() {

        this(0, 0, 0);
    }

    public boolean equalsTo(Point3d m) {

        return (xCoord==m.xCoord & yCoord==m.yCoord & zCoord==m.zCoord);

    }

    public static double distanceTo(Point3d m, Point3d n) {

        return Math.sqrt(Math.pow((m.xCoord - n.xCoord), 2) + Math.pow((m.yCoord - n.yCoord), 2) + Math.pow((m.zCoord - n.zCoord), 2));

    }

    public static double computeArea(Point3d m, Point3d n, Point3d o) {
        double a = distanceTo(m, n);
        double b = distanceTo(n, o);
        double c = distanceTo(o, m);
        double p = (a + b + c) / 2;
        return  Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
