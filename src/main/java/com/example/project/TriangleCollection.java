package com.example.project;

public class TriangleCollection {
  // array of Triangles
  private Triangle[] collection;
 
 
  // Constructor: initialize collection array with the number of
  // Triangle objects specified by numTriangles, with the first
  // Triangle in the collection having vertices at Points:
  // (-startx, 0), (0, startY), (startX, 0)
  //
  // Then, each subsequent Triangle object in the collection (up to
  // numTriangles) should be created with same first and second vertices,
  // (-startX, 0) and (0, startY), but with a different third vertex located
  // at (startX - i, 0), where i is the index in the collections array where
  // the Triangle object is located
  //
  // For example, creating a TriangleCollection with numTriangles = 6,
  // startX = 4, and startY = 7 would yield a collections array containing
  // 6 Triangles with the following vertices:
  // Triangle 0: (-4, 0), (0, 7), (4, 0)
  // Triangle 1: (-4, 0), (0, 7), (3, 0)
  // Triangle 2: (-4, 0), (0, 7), (2, 0)
  // Triangle 3: (-4, 0), (0, 7), (1, 0)
  // Triangle 3: (-4, 0), (0, 7), (0, 0)
  // Triangle 3: (-4, 0), (0, 7), (-1, 0)
 
 
  // PRECONDITION: numTriangles >= 2
  public TriangleCollection(int numTriangles, int startX, int startY) {
    collection = new Triangle[numTriangles];
    Point point1 = new Point(startX * -1, 0);
    Point point2 = new Point(0, startY);
    for (int i = 0; i < numTriangles; i++) {
      Point point3 = new Point(startX - i, 0);
      collection[i] = new Triangle(point1, point2, point3);
    }
  }
 // Calculate and return the sum of the perimeters of
  // all Triangles in the collection
  public double totalPerimeter() {
    double sum = 0.0;
    for (Triangle triangle : collection) {
      sum += triangle.perimeter();
    }
    return sum;
  }
 
 
  // adds increment to both the x and y coordinates of each of the
  // three Points in every Triangle in the collections array
  // ADD GETTER AND SETTER METHODS TO OTHER CLASSES AS NECESSARY
  public void shiftTriangles(int increment) {
    int point1X = collection[0].getVertices()[0].getX() + increment;
    int point1Y = collection[0].getVertices()[0].getY() + increment;
    Point point1 = new Point(point1X, point1Y);
    int point2X = collection[0].getVertices()[1].getX() + increment;
    int point2Y = collection[0].getVertices()[1].getY() + increment;
    Point point2 = new Point(point2X, point2Y);
    for (int i = 0; i < collection.length; i++) {
        int point3X = collection[i].getVertices()[2].getX() + increment;
        int point3Y = collection[i].getVertices()[2].getY() + increment;
        Point point3 = new Point(point3X, point3Y);
        collection[i] = new Triangle(point1, point2, point3);
    }
  }
 
 
  // returns a String that contains each Triangle in the
  // collection on a new line; for example, the string
  // representing a collection containing three
  // Triangles should look like this when printed:
  //
  // "[(1, 5), (5, 12), (9, 5)]
  //  [(1, 5), (5, 12), (8, 5)]
  //  [(1, 5), (5, 12), (7, 5)]"
  public String triangleCollectionInfo() {
    String returnString = "";
    for (int i = 0; i < collection.length; i++) {
      returnString += collection[i].triangleInfo() + "\n";
    }
    return returnString;
  }
 }