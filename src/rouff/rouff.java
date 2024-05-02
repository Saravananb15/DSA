package rouff;

import java.util.HashSet;
import java.util.Set;

public class rouff {
	public static void main(String[] args) {
		rouff rou = new rouff();
		System.out.println(rou.isPalindrome(121));
		System.out.println("\"**Title:** **Spring Boot OpenAI Integration and AI-Powered Web Application**\\n\\n**Project Overview:**\\n\\nThis project aims to utilize OpenAI's API within a Spring Boot application to provide AI-powered functionality. The current implementation connects to OpenAI and retrieves responses for user queries, while future plans include automating daily quote generation and fraud detection.\\n\\n**Key Features:**\\n\\n- **OpenAI Integration:** Seamless connection to OpenAI's API for text generation and response retrieval.\\n- **Quote Generation:** Planned implementation for generating daily business-related quotes using OpenAI's API.\\n- **Fraud Detection:** Future plans to employ GPT to analyze user data for fraud detection in a web application.\\n\\n**Technical Stack:**\\n\\n- **Java:** Development language\\n- **Spring Boot:** Framework for building robust and scalable applications\\n- **OpenAI API:** For AI text generation and response retrieval\\n- **Thymeleaf:** Template engine for dynamic web pages (future implementation)\\n\\n**Getting Started:**\\n\\n1. Clone the repository: `git clone https://github.com/your-username/openai-integration-webapp.git`\\n2. Install the dependencies: `mvn install`\\n3. Run the application: `mvn spring-boot:run`\\n4. Visit localhost:8080 to interact with the OpenAI integration.\\n\\n**Future Plans:**\\n\\n- **Automated Quote Generation:** Implement a daily quote generator using OpenAI's API to enhance the website's user experience.\\n- **Fraud Detection Integration:** Utilize GPT's capabilities to analyze user behavior and identify potential fraudulent activities.\\n- **Additional AI Features:** Explore the possibilities of incorporating other AI-powered functionalities into the web application.\\n\\n**Contributing:**\\n\\nContributions to this project are welcome! Please follow the [contribution guidelines](CONTRIBUTING.md) before submitting any pull requests.\\n\\n**License:**\\n\\nThis project is licensed under the MIT License.\"");
	}

	public boolean isPalindrome(int x) {
		String palin = String.valueOf(x);
		int n = palin.length();
		
		for(int i=0;i<n/2;i++) {
			if(palin.charAt(i) != palin.charAt(n-i-1)) {
				return false;
			}
		}
		return true;
	}
}
