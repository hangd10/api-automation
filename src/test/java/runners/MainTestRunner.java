package test.java.runners;

import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;

import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

public abstract class MainTestRunner {
	private TestNGCucumberRunner testNGCucumberRunner;
	private ExtentProperties extentProperties;
	private String sTestCaseName;

	@Parameters({ "TestCaseName" })
	@BeforeClass(alwaysRun = true)
	public void setUpClass(String testNGparam) throws Exception {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());

		// Set TestcaseName
		sTestCaseName = testNGparam;

		// Set up Extent report
		extentProperties = ExtentProperties.INSTANCE;
		extentProperties.setReportPath("CucumberOutput/Extentreport.html");
		
		File file = new File ( extentProperties.getReportPath().toString() );
		if (file.exists ()){
			file.setWritable ( true );
			file.delete();	
		}

	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {
		//writeCucumberExtentReport();
		testNGCucumberRunner.finish();
	}
		
	@Test(groups = "cucumber", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}
	
	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}
	
	public void writeCucumberExtentReport(){
		//Reporter.loadXMLConfig(new File("src/main/resources/extent-config.xml"));
		Reporter.setTestRunnerOutput("Report : CucumberOutput/Extentreport.html");

		// OS name
		Reporter.setSystemInfo ( "OS", System.getProperty ( "os.name" ) );

		// Machine name
		try {
			Reporter.setSystemInfo ( "Machine", InetAddress.getLocalHost ().getHostName () );
		} catch (UnknownHostException e) {
			e.printStackTrace ();
		}

		// Machine User name
		//extent.setSystemInfo ( "User Name", "PA" );
		Reporter.setSystemInfo ( "Machine User Name", System.getProperty("user.name"));

		// Working Directory
		Reporter.setSystemInfo ( "Working Directory", System.getProperty("user.dir") );

		// Time zone
		Reporter.setSystemInfo ( "Timezone", new SimpleDateFormat("zzz").format(new Date()) );

		// Suite name
		//Reporter.setSystemInfo ( "Suite Name", testContext.getSuite ().getName () );
	}

}
