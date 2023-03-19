package preproc;

public class PreProcessorToUpperImpl implements PreProcessor {
    @Override
    public String preProcess(String str) {
        return str.toUpperCase();
    }
}
