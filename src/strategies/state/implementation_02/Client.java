package strategies.state.implementation_02;

import strategies.state.implementation_02.blocks.*;

public class Client {

    public static void main(String[] args) {

        Context
                context = new Context();

        context.setBlockState(new GrassBlock());

        for (int i = 1; i < 4; i++) {
            context.interaction();
            context.getState();
        }
    }
}