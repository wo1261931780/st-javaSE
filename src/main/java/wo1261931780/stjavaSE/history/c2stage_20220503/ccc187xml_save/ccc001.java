package wo1261931780.stjavaSE.history.c2stage_20220503.ccc187xml_save;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220503.ccc187xml_case
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-14-04  星期二
 */
public class ccc001 {
    public static void main(String[] args) throws Exception {
        SAXReader x = new SAXReader();
        // Document doc = x.read(ccc001.class.getResourceAsStream("/ccc003Contacts.xml"));
        Document doc = x.read(new File("src/c2stage_20220503/ccc187xml_case/ccc003Contacts.xml"));

        Element rootElement = doc.getRootElement();
        List<Element> e_lists = rootElement.elements("contact");
        List<ccc002bean> show = new ArrayList<>();
        for (Element demo : e_lists) {
            ccc002bean c2 = new ccc002bean();
            c2.setId(Integer.valueOf(demo.attributeValue("id")));
            c2.setVip(Boolean.valueOf(demo.attributeValue("vip")));
            c2.setName(demo.elementTextTrim("name"));
            c2.setGender(demo.elementTextTrim("gender"));
            c2.setEmail(demo.elementTextTrim("email"));
            show.add(c2);
        }
        for (ccc002bean showres : show) {
            System.out.println(showres);
        }


        // try {
        //     Document read = x.read(new File("src/c2stage_20220503/ccc187xml_case/ccc003Contacts.xml"));
        //     Element roote = read.getRootElement();
        //     System.out.println(roote.getName());
        //     List<Element> e_list = roote.elements();
        //     List<String> show = new ArrayList<>();
        //     for (Element ccc038demo : e_list) {
        //         // System.out.println(ccc038demo);
        //         List<Element> inner_e = ccc038demo.elements();
        //         for (Element element : inner_e) {
        //             System.out.println(element);
        //         }
        //         // show.add("名称：" + ccc038demo.getName() + "，内容：" + ccc038demo.attributeValue());
        //     }
        //     System.out.println(show);
        // } catch (Exception e) {
        //     // throw new Exception(e);
        //     e.printStackTrace();
        // }
    }
}
