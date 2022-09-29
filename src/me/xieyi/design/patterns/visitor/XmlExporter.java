package me.xieyi.design.patterns.visitor;

public class XmlExporter {
    public String visit(Dot dot) {
        return "<xml><dot><x>" + dot.getX() + "</x><y>" + dot.getY() + "</y></dot></xml>";
    }
}
