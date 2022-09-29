package me.xieyi.design.patterns.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    @Test
    public void drawDotShouldReturnDotCoordinate() {
        Dot dot = new Dot(0, 0);
        assertEquals("0,0", dot.draw());
    }

    @Test
    public void drawCircleShouldReturnCircleCoordinateAndRadius() {
        Circle circle = new Circle(0, 0, 1);
        assertEquals("0,0,1", circle.draw());
    }

    @Test
    public void drawRectangleShouldReturnReCircleCoordinateAndWidthAndHeight() {
        Rectangle rectangle = new Rectangle(0, 0, 1, 1);
        assertEquals("0,0,1,1", rectangle.draw());
    }

    @Test
    public void exportDotInfoInJsonFormat() {
        Dot dot = new Dot(0, 0);
        assertEquals("{'x':0,'y':0}", new JsonExporter().visit(dot));
    }

    @Test
    public void exportCircleInfoInJsonFormat() {
        Circle circle = new Circle(0, 0, 1);
        assertEquals("{'x':0,'y':0,'radius':1}", new JsonExporter().visit(circle));
    }

    @Test
    public void exportRectangleInfoInJsonFormat() {
        Rectangle rectangle = new Rectangle(0, 0, 1, 1);
        assertEquals("{'x':0,'y':0,'width':1,'height':1}", new JsonExporter().visit(rectangle));
    }

    @Test
    public void exportDotInfoInXmlFormat() {
        Dot dot = new Dot(0, 0);
        assertEquals("<xml><dot><x>0</x><y>0</y></dot></xml>", new XmlExporter().visit(dot));
    }

    @Test
    public void exportRectangleInfoInXmlFormatIsNotAllowed() {
        Rectangle rectangle = new Rectangle(0, 0, 1, 1);
        assertEquals("NotAllowed", new XmlExporter().visit(rectangle));
    }

    @Test
    public void exportDotInfoInJsonFormatWithVisitor() {
        Dot dot = new Dot(0, 0);
        Visitor visitor = new JsonExporter();
        assertEquals("{'x':0,'y':0}", dot.accept(visitor));
    }

    @Test
    public void exportCircleInfoInJsonFormatWithVisitor() {
        Circle circle = new Circle(0, 0, 1);
        Visitor visitor = new JsonExporter();
        assertEquals("{'x':0,'y':0,'radius':1}", circle.accept(visitor));
    }

    @Test
    public void exportRectangleInfoInJsonFormatWithVisitor() {
        Rectangle rectangle = new Rectangle(0, 0, 1, 1);
        Visitor visitor = new JsonExporter();
        assertEquals("{'x':0,'y':0,'width':1,'height':1}", rectangle.accept(visitor));
    }

    @Test
    public void exportDotInfoInXmlFormatWithVisitor() {
        Dot dot = new Dot(0, 0);
        Visitor visitor = new XmlExporter();
        assertEquals("<xml><dot><x>0</x><y>0</y></dot></xml>", dot.accept(visitor));
    }

}
