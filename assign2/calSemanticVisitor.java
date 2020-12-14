import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class calSemanticVisitor extends calBaseVisitor<boolean>
{
    HashMap<String,String> hm =new HashMap<String,String>();
    

    @Override
    public String visitNempParam(calParser.NempParamContext ctx) {
        String ID = ctx.ID().getText();
        String type = ctx.type().getText();
        return ID + ":" + type;
        
    }

    @Override
    public String visitNempParamList(calParser.NempParamListContext ctx) {
        String ID = ctx.ID().getText();
        String type = ctx.type().getText();
        String next_arg = visit(ctx.nemp_param_list());
        return ID + ":" + type + "," + next_arg;

}