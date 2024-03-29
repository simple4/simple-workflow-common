package net.simpleframework.workflow.remote;

import java.io.IOException;
import java.util.Map;

/**
 * 这是一个开源的软件，请在LGPLv3下合法使用、修改或重新发布。
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
public interface IWorkflowRemote {

	Map<String, Object> call(String url, String method) throws IOException;

	/**
	 * 
	 * @param url
	 * @param method
	 * @param data
	 * @return
	 * @throws IOException
	 */
	Map<String, Object> call(String url, String method, Map<String, Object> data) throws IOException;
}
