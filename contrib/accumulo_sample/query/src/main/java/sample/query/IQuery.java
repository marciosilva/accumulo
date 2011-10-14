package sample.query;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.jboss.resteasy.annotations.GZIP;

import sample.Results;

@Path("/Query")
public interface IQuery {
	
	@GET
	@POST
	@Path("/html")
	@Consumes("*/*")
	@GZIP
	public String html(@QueryParam("query") String query, @QueryParam("auths") String auths);

	@GET
	@POST
	@Path("/xml")
	@Consumes("*/*")
	@Produces("application/xml")
	@GZIP
	public Results xml(@QueryParam("query") String query, @QueryParam("auths") String auths);

	@GET
	@POST
	@Path("/json")
	@Consumes("*/*")
	@Produces("application/json")
	@GZIP
	public Results json(@QueryParam("query") String query, @QueryParam("auths")  String auths);

	@GET
	@POST
	@Path("/yaml")
	@Consumes("*/*")
	@Produces("text/x-yaml")
	@GZIP	
	public Results yaml(@QueryParam("query") String query, @QueryParam("auths")  String auths);

	@GET
	@POST
	@Path("/content")
	@Consumes("*/*")
	@Produces("application/xml")
	@GZIP	
	public Results content(@QueryParam("query") String query, @QueryParam("auths")  String auths);

}