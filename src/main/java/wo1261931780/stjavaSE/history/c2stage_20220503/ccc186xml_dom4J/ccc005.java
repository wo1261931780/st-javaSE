package wo1261931780.stjavaSE.history.c2stage_20220503.ccc186xml_dom4J;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220503.ccc186xml_dom4J
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-12-47  星期二
 */
public class ccc005 {
    // @Test
    public void show() throws DocumentException {
        SAXReader x = new SAXReader();
        Document read = x.read(new File("src/c2stage_20220503/ccc186xml_dom4J/ccc002books.xml"));
        Element rootElement = read.getRootElement();
        System.out.println(rootElement);
        List<Element> demo = rootElement.elements();
        for (Element element : demo) {
            System.out.println(element.getName());
        }
        // 只会拿到第一级的元素：book--book--sql
        Element book = rootElement.element("book");// 获取指定元素
        System.out.println(book.elementText("name"));// 直接获取元素的内容
        System.out.println(book.elementTextTrim("name"));// 去掉前后空格
        Attribute element_id = book.attribute("id");
        System.out.println(element_id.getName()+"---"+element_id.getValue());
        // 获取元素内部的值和标签：id---0001
        String text = element_id.getText();// 必须要最底层的元素，才可以直接获取元素内容
        System.out.println(text);

        System.out.println(book.attributeValue("desc"));// 直接获取属性值：我是第一本书

    }
}
