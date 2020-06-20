package strategies.state.implementation_02.blocks;

import strategies.state.implementation_02.*;

public class DirtBlock extends Block{

    public void interact(Context context){
        context.setBlockState(new GrassBlock());
    }
}
