package net.simpleframework.workflow;

import net.simpleframework.common.SimpleRuntimeException;

/**
 * 这是一个开源的软件，请在LGPLv3下合法使用、修改或重新发布。
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
public class WorkflowException extends SimpleRuntimeException {
	private static final long serialVersionUID = 7984366934401318860L;

	public WorkflowException(final String msg, final Throwable cause) {
		super(msg, cause);
	}

	public static WorkflowException of(final Throwable throwable) {
		return _of(WorkflowException.class, null, throwable);
	}

	public static WorkflowException of(final String msg) {
		return _of(WorkflowException.class, msg, null);
	}
}
