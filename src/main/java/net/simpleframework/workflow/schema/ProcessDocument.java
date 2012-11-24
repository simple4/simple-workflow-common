package net.simpleframework.workflow.schema;

import java.io.CharArrayReader;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;

import net.simpleframework.common.ClassUtils;
import net.simpleframework.common.xml.XmlDocument;

/**
 * 这是一个开源的软件，请在LGPLv3下合法使用、修改或重新发布。
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
public class ProcessDocument extends XmlDocument {
	public ProcessDocument(final InputStream inputStream) {
		super(inputStream);
	}

	public ProcessDocument(final char[] charArray) {
		super(new CharArrayReader(charArray));
	}

	public ProcessDocument(final Reader reader) {
		super(reader);
	}

	public ProcessDocument() {
		super(ClassUtils.getResourceAsStream(ProcessDocument.class, "null-pdl.xml"));
	}

	private ProcessNode processNode;

	@Override
	public String toString() {
		getProcessNode().syncElement();
		return super.toString();
	}

	@Override
	public ProcessDocument clone() {
		return new ProcessDocument(new StringReader(toString()));
	}

	public ProcessNode getProcessNode() {
		if (processNode == null) {
			processNode = new ProcessNode(getRoot().elementIterator().next());
			processNode.startNode();
			processNode.endNode();
		}
		return processNode;
	}
}
