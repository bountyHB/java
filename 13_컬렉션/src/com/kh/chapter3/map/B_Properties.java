package com.kh.chapter3.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

public class B_Properties {
	// Properties를 생성하고 저장, 출력(파일) 테스트 
	public void method1() {
		// <> 가 없지만 String으로 지정되어있는것임. 
		Properties prop = new Properties();
		
//		prop.put(prop, prop); => 도 가능하지만, object로 받아들임 
//		prop.setProperty(null, null); // => String 타입으로 받아들이게 지정되어 있다.
		
		// 순서 유지 X, 키값 중복 X, 중복된 key값은 마지막으로 입력한 value로 덮여쓰게 된다. 
		prop.setProperty("List", "LinkedList");
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		
		
		System.out.println(prop);
		System.out.println();
		
		// value 값 읽어오기 
		// 역시 key 값을 string으로 제한하고 있는 getProperty로 사용한다.
		System.out.println(prop.getProperty("List"));
		// 해당하는 key값이 존재하지 않으면 default value가 리턴된다. 
		System.out.println(prop.getProperty("Stack" , "값이 없습니다."));
		System.out.println();
		
		// formap 이용 
		for (Entry<Object, Object> entry : prop.entrySet()) {
			// 값을 하나씩 출력해서 처리하려면 아래 세줄로 
			String key = (String)entry.getKey();
			String value = (String)entry.getValue();
			
			System.out.printf("key : %s, value : %s\n", key, value);
			// 단순하게 toString 을 출력하려면 아래 한줄로 
//			System.out.println(entry);
		}

		// 파일로 만들기 
		
		try {
//			prop.store(new FileOutputStream("test1.properties"), "Properties Test 1");
//			prop.store(new FileWriter("test2.properties"), "Properties Test 2");
			prop.storeToXML(new FileOutputStream("text3.xml"), "XML TEST");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	// Properties를 생성하고 저장(파일), 출력 테스트 
	public void method2() {
		Properties prop = new Properties();

		try {
//			prop.load(new FileInputStream("test1.properties"));
//			prop.load(new FileReader("test2.properties"));
			prop.loadFromXML(new FileInputStream("text3.xml"));
			System.out.println(prop);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
