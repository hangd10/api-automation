## Online Bind APIc QA Automation

Testing APIc calls via Java/TestNG/RestAssured

### Run Regression Test in Production

```
mvn compile test -DsuiteXmlFiles=src/test/resources/RegressionTests.xml -Denv=PROD

```

### Run Smoke Test in ProdFix.  This includes all .feature files with @smoke annotation

```
mvn compile test -DsuiteXmlFiles=src/test/resources/SmokeTests.xml -Denv=ProdFix
```

### Run subset of tests in DEV1.  This includes all .feature files with @only annotation.  This can be used for local testing.

```
mvn compile test -DsuiteXmlFiles=src/test/resources/TestSuiteWithOnly.xml -Denv=DEV1
```