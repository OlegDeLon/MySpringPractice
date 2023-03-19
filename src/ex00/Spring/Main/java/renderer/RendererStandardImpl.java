package renderer;


import preproc.PreProcessor;

public class RendererStandardImpl implements Renderer {
    PreProcessor preProcessor;

    public RendererStandardImpl(PreProcessor preProcessor) {
        this.preProcessor = preProcessor;
    }

    @Override
    public void print(String message) {
        message = preProcessor.preProcess(message);
        System.out.println(message);
    }
}
