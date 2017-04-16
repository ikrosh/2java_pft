package ua.ikrosh.mantis.tests;

import biz.futureware.mantis.rpc.soap.client.MantisConnectLocator;
import org.testng.annotations.Test;
import ua.ikrosh.mantis.model.Issue;
import ua.ikrosh.mantis.model.Project;

import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Set;

import static org.testng.Assert.assertEquals;

public class SoapTests extends TestBase{


  private int issueId = 38;


  @Test
  public  void testGetProjects() throws RemoteException, ServiceException, MalformedURLException {
    Set<Project> projects = app.soap().getProjects();
    System.out.println(projects.size());
    for (Project project : projects) {
      System.out.println(project.getName());
    }
  }

  @Test
  public void testGetIssue() throws MalformedURLException, ServiceException, RemoteException {
    Issue issue = app.soap().getIssue(issueId);
    System.out.println(issue);
    System.out.println(issue.getStatus() + " " + issue.getId());
  }


    @Test
  public void testCreateIssue() throws MalformedURLException, ServiceException, RemoteException {
    Set<Project> projects = app.soap().getProjects();
    Issue issue = new Issue().withSummary("Test issue")
            .withDescription("Test issue description").withProject(projects.iterator().next());
    Issue created = app.soap().addIssue(issue);
    assertEquals(issue.getSummary(), created.getSummary());
  }
}
