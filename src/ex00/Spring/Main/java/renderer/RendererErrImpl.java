package renderer;

import preproc.PreProcessor;

public class RendererErrImpl implements Renderer {
    PreProcessor preProcessor;

    public RendererErrImpl(PreProcessor preProcessor) {
        this.preProcessor = preProcessor;
    }

    @Override
    public void print(String message) {
        message = preProcessor.preProcess(message);
        System.err.println(message);
    }
}
