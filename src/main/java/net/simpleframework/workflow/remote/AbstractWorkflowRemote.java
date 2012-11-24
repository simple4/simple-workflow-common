package net.simpleframework.workflow.remote;

import java.io.IOException;
import java.util.Map;

import net.simpleframework.common.ObjectEx;

/**
 * 这是一个开源的软件，请在LGPLv3下合法使用、修改或重新发布。
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
public abstract class AbstractWorkflowRemote extends ObjectEx implements IWorkflowRemote {

	@Override
	public Map<String, Object> call(final String url, final String method) throws IOException {
		return call(url, method, null);
	}
}
