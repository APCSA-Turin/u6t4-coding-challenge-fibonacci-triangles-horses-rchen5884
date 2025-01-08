package com.example.project;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
    // Returns distance between this Point object and another Point object
    public double distanceTo(Point other) {
      double x1 = x;
      double x2 = other.x;
      double y1 = y;
      double y2 = other.y;
      return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
   
   
    // Returns a string in the format: (x, y)
    public String pointInfo() {
      return "(" + x + ", " + y + ")";
    }
   
   
    public int getX() {
      return x;
    }
   
   
    public int getY() {
      return y;
    }
   }

  