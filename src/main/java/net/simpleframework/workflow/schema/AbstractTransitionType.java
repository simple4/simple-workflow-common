package net.simpleframework.workflow.schema;

import net.simpleframework.common.xml.XmlElement;

/**
 * 这是一个开源的软件，请在LGPLv3下合法使用、修改或重新发布。
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
public class AbstractTransitionType extends AbstractNode {

	public AbstractTransitionType(final XmlElement beanElement, final TransitionNode parent) {
		super(beanElement, parent);
	}

	public static class Conditional extends AbstractTransitionType {
		private boolean manual;

		private String expression;

		public Conditional(final XmlElement beanElement, final TransitionNode parent) {
			super(beanElement == null ? addTransitionType(parent, "conditional") : beanElement, parent);
		}

		public String getExpression() {
			return expression;
		}

		public Conditional setExpression(final String expression) {
			this.expression = expression;
			return this;
		}

		public boolean isManual() {
			return manual;
		}

		public Conditional setManual(final boolean manual) {
			this.manual = manual;
			return this;
		}
	}

	public static class LogicConditional extends AbstractTransitionType {
		private boolean manual;

		private ETransitionLogic logic;

		private String transitionId;

		public LogicConditional(final XmlElement beanElement, final TransitionNode parent) {
			super(beanElement == null ? addTransitionType(parent, "logic-conditional") : beanElement,
					parent);
		}

		public ETransitionLogic getLogic() {
			return logic;
		}

		public LogicConditional setLogic(final ETransitionLogic logic) {
			this.logic = logic;
			return this;
		}

		public String getTransitionId() {
			return transitionId;
		}

		public LogicConditional setTransitionId(final String transitionId) {
			this.transitionId = transitionId;
			return this;
		}

		public boolean isManual() {
			return manual;
		}

		public LogicConditional setManual(final boolean manual) {
			this.manual = manual;
			return this;
		}
	}

	public static class Interface extends AbstractTransitionType {
		private String handleClass;

		public Interface(final XmlElement beanElement, final TransitionNode parent) {
			super(beanElement == null ? addTransitionType(parent, "interface") : beanElement, parent);
		}

		public String getHandleClass() {
			return handleClass;
		}

		public Interface setHandleClass(final String handleClass) {
			this.handleClass = handleClass;
			return this;
		}
	}

	static XmlElement addTransitionType(final TransitionNode transition, final String name) {
		return transition.addChild("transition-type", name, true);
	}
}
