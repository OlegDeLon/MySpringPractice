package printer;

import renderer.Renderer;
import java.util.Date;

public class PrinterWithDateTimeImpl implements Printer {
    private Date date = new Date();
    private Renderer renderer;

    public PrinterWithDateTimeImpl(Renderer renderer) {
        this.renderer = renderer;
    }

    @Override
    public void print(String message) {
        renderer.print(date.toString() + " " + message);
    }
}
