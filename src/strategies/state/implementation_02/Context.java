package strategies.state.implementation_02;

public class Context {

    Block
            blockState;

    void interaction(){ blockState.interact(this);}

    public void setBlockState(Block block){blockState = block;}

    public void getState(){
        System.out.println(blockState.getClass());
    }
}