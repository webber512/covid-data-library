# covid-data-library
A Java library for accessing coronavirus tracking data from the COVID Tracking Project

## Setup
1. Create a project using gradle or maven
2. Import covid-data-library (coming soon)
3. Add required dependencies: `com.google.code.gson:gson:2.8.6`, and `org.projectlombok:lombok:1.18.1'`

## Using the COVID Data Library
Add the below line to your program:
``` COVIDData covid = new COVIDData(); ```

Then add code for each function you wish to implement, like this:
```BasicData bd = covid.USDataRequest.getBasicDataAsOfToday();```

## Documentation
Coming Soon

## Special Thanks
Check out the covidtracking API!

