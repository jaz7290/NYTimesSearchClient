package de.l3s.client;

import java.io.IOException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.utils.URIBuilder;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.json.impl.JSONMarshallerImpl;

import de.l3s.article.NyResults;

public class ArticleSearchClient {
	
	//q=new+york+times&page=1&api-key={{apiKey}}
	private String baseURL = "http://api.nytimes.com/svc/search/version/articlesearch.json";
	private String version;
	private String apiKey;
	public ArticleSearchClient( String version, String apiKey ) {
		this.apiKey = apiKey;
		this.baseURL = this.baseURL.replaceAll("version", version);
		
	}
	
	public NyResults search( String query, Integer rows, Long startDate, Long endDate )
	{
		
		URIBuilder builder = null;
		try {
			builder = new URIBuilder(baseURL);
			builder.addParameter("api-key", apiKey);
			builder.addParameter("q", query.replaceAll(" ", "+"));
			if(startDate !=null && endDate !=null){
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
				Date d1 = new Date(startDate);
				Date d2 = new Date(endDate);
				
				String start = sdf.format(d1);
				String end = sdf.format(d2);
				
				builder.addParameter("begin_date", start);
				builder.addParameter("end_date", end);
				
				
			}
			
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(builder.toString());
		
		
		int pageLimit = rows / 10;
		NyResults response = new NyResults();
		
		for(int i=0; i<pageLimit; i++) {
			URIBuilder temp = builder;
			temp.addParameter("page", ""+i);
			WebResource resource = Client.create().resource(builder.toString());
			NyResults response_temp = resource.get( NyResults.class );
			response.getResponse().getDocs().addAll(response_temp.getResponse().getDocs());
			response.setStatus(response_temp.getStatus());
			response.setCopyright(response_temp.getCopyright());
			response.getResponse().setMeta(response_temp.getResponse().getMeta());
		}


		
		
		return response;
		
	}
	
	public String getBaseURL() {
		return baseURL;
	}

	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	

}
