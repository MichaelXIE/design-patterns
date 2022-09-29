package me.xieyi.design.patterns.visitor;

public class XmlExporter implements Visitor{
    public String visit(Dot dot) {
        return "<xml><dot><x>" + dot.getX() + "</x><y>" + dot.getY() + "</y></dot></xml>";
    }

    /**
     * @param circle
     * @return
     */
    @Override
    public String visit(Circle circle) {
        return "";
    }

    @Override
    public String visit(Rectangle rectangle) {
        return "NotAllowed";
    }
}
