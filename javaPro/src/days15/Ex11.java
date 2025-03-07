package days15;

import javax.print.attribute.standard.PrinterInfo;

public class Ex11 {

	public static void main(String[] args) {
		String parsingFile = "hello.xml"; //파싱하고자하는 파일
		String docType = "xml";
		
		Parseable parser = ParserManager.getParser(docType);
		parser.parse(parsingFile);
		
		System.out.println("end");
		
	}	//main

}	//class

interface Parseable{
	void parse(String fileName);	//파일명 파싱(구문분석)하는 메서드
	default void print() {
		
	}
}

class XMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println("> XML파일 구문 분석 코딩...");
	}
	
	public void print() {
		System.out.println("> XML파일 구문 분석 후 인쇄 코딩...");
	}
	
}

class HTMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println("> HTML파일 구문 분석 코딩...");
	}
	
}

class ParserManager{
	public static Parseable getParser(String docType) {	// xml	html
		if (docType.equals("xml")) {
			return new XMLParser();
		}else if(docType.equals("html")) {
		return new HTMLParser();
		}else {
			return null;
		}
	}
}

