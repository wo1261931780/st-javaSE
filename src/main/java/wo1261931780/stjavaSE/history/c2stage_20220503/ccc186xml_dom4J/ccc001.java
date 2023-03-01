package wo1261931780.stjavaSE.history.c2stage_20220503.ccc186xml_dom4J;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220503.ccc186xml_dom4J
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-10-39  星期二
 */
public class ccc001 {
	// @Test
	public void analysis() throws DocumentException {
		SAXReader x = new SAXReader();
		// try {
		Document read = x.read(new File("src/main/java/wo1261931780/stjavaSE/history/c2stage_20220503/ccc186xml_dom4J/ccc002books.xml"));
		// 这里也要在包名下去寻找文件，可以使用class去定位文件
		// InputStream ccc038demo = ddd050做数组拷贝.class.getResourceAsStream("/ccc002books.xml");
		// Document res = x.read(ccc038demo);// 加载为一个文档对象
		Element rootElement = read.getRootElement();
		System.out.println(rootElement.getName());// books
		// System.out.println(res.getName());
		// System.out.println(rootElement);
		// } catch (Exception e) {
		//     // throw new RuntimeException(e);
		//     e.printStackTrace();
		// }
	}
}
