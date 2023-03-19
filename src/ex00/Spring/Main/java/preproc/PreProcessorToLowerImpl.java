package preproc;

public class PreProcessorToLowerImpl implements PreProcessor {

    @Override
    public String preProcess(String str) {
        return str.toLowerCase();
    }
}
