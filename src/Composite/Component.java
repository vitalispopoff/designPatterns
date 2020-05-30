package Composite;

public abstract class Component {

	Component
			leftBranch = null,
			rightBranch = null,
			rootBranch = null,
			nextBranch = null,
			previousBranch = null,
			headBranch = null,
			tailBranch = null;

	abstract public void addBranch(Component branch);

	abstract public void removeBranch(Component branch);

	abstract public Component getBranch();
}
