package days17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		
		String fileName = "SS21_Team.txt";
		
		String MyName = "김인경";
		String teamLeader = null;
		String teamMemberLine = null; //팀구성멤버 라인 변수
		String teamLine = null; //팀 조 1/2조 저장배열
		String [] teamMember = null; //팀원들 저장할 배열
		String regex = "\\s*,\\s*";
		
		String key = "user.dir";
		String userDir = System.getProperty(key);
		System.out.println( userDir);
		
		fileName = String.format("%s\\src\\days17\\%s", userDir, fileName);
//		System.out.println(fileName);

		try (
			FileReader reader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(reader);)
		{
			while ((teamLine = br.readLine() ) != null) {
				teamMemberLine = br.readLine();
				if (teamMemberLine.contains(MyName)){
					break;
				}
			}
//			System.out.println(teamLine);
//			System.out.println(teamMemberLine);
			teamMember = teamMemberLine.split(regex); //배열이됨
			
			String prefix = "[팀장]";
			for (int i = 0; i < teamMember.length; i++) {
				if ( teamMember[i].trim().startsWith(prefix))
				teamLeader = teamMember[i].trim().replace(prefix, "");	//[팀장] 제거
			}//for
//			System.out.println(teamLeader);
			
			//나머지 팀장을 뺀 나머지 팀원 (내림차순)
			String [] temp = new String[teamMember.length-1];
			System.arraycopy(teamMember, 1, temp, 0, teamMember.length-1);
//			System.out.println(Arrays.toString(temp));
			Arrays.sort(temp);
//			System.out.println(Arrays.toString(temp));
			System.arraycopy(temp, 0, teamMember,1,temp.length);
//			System.out.println(Arrays.toString(temp));
			
			Arrays.sort(temp, (s1,s2)-> s2.compareTo(s1));
			
			StringBuilder sb = new StringBuilder(teamLine);
			sb.append("<ul>\n");
			sb.append("<li class=\"leader\">"+teamLeader+"</li>\n");
			sb.append("\t<li>");
			sb.append(String.join("</li>\n\t<li>", temp));
			sb.append("</ul>\n");
			
			System.out.println(sb.toString());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	} //main

}// class
