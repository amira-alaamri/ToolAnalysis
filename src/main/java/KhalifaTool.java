import org.opencb.opencga.analysis.tools.OpenCgaTool;
import org.opencb.opencga.core.exceptions.ToolException;
import org.opencb.opencga.core.models.common.Enums;
import org.opencb.opencga.core.tools.annotations.Tool;

@Tool(id = KhalifaTool.ID, resource = Enums.Resource.VARIANT,
        description = KhalifaTool.DESCRIPTION)
public class KhalifaTool extends OpenCgaTool {

    public static final String ID = "TrialAnalysis";
    public static final String DESCRIPTION = "Try to run an analysis";

    // private double coeff;

    public KhalifaTool() {
        System.out.println("In Kt constructor");
    }

    @Override
    protected void check() throws Exception {
        System.out.println("In check()");
        super.check();
    }

    @Override
    protected void run() throws ToolException{

        System.out.println("In calling executor");
        KhalifaToolExecutor executor = new KhalifaToolExecutor();

        executor.execute();


    }
}
