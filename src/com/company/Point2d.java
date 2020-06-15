package com.company;


//  двумерный класс точки.

public class Point2d {
// координата X
    protected double xCoord;
// координата Y
    protected double yCoord;

//  Конструктор инициализации
    public Point2d (double x, double y) {
        xCoord = x;
        yCoord = y;
    }
//  Конструктор по умолчанию
    public Point2d () {
//Вызовите конструктор с двумя параметрами и определите источник.
        this(0, 0);
    }
//  Возвращение координаты
    public double getX () {

        return xCoord;
    }
//  Возвращение координаты Y
    public double getY () {

        return yCoord;
    }
//  Установка значения координаты X.
    public void setX ( double val) {

        xCoord = val;
    }
//  Установка значения координаты Y.
    public void setY ( double val) {

        yCoord = val;
    }

    public static void main(String[] args) {
        //создаем точку 0,0
        Point2d myPoint = new Point2d();

        //создаем точку 5,3
        Point2d myOtherPoint = new Point2d(5, 3);

        Point2d aThirdPoint = new Point2d();

    }
}

