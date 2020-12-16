import org.opencb.opencga.core.exceptions.ToolException;
import org.opencb.opencga.core.tools.OpenCgaToolExecutor;
import org.opencb.opencga.core.tools.annotations.ToolExecutor;

@ToolExecutor(id = "analysis-local",
        tool = KhalifaTool.ID,
        source = ToolExecutor.Source.STORAGE,
        framework = ToolExecutor.Framework.LOCAL)
public class KhalifaToolExecutor extends OpenCgaToolExecutor {

    public KhalifaToolExecutor() {
        System.out.println("In Kt executor constructor");

    }

    // Your analysis
    @Override
    public void run() throws ToolException {

        System.out.println("I ran the executor");
    }
}
