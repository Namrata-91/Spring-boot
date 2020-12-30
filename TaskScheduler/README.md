# Spring Boot – Scheduling
Scheduling is a process of executing the **tasks for the specific time period**.

The **@EnableScheduling** annotation is used to **enable the scheduler for your application** .

This annotation should be added into the main Spring Boot application class file.

```javascript
@SpringBootApplication
@EnableScheduling
public class JavaExpApplication {
 public static void main(String[] args) {
 SpringApplication.run(JavaExpApplication.class, args); 
}
}
```

## 1. Java Cron Expression
Java Cron expressions are used to configure the instances of CronTrigger, a
subclass of org.quartz.Trigger.
For more information about Java cron expression you can refer to this [Link](https://docs.oracle.com/cd/E12058_01/doc/doc.1014/e12030/cron_expressions.htm)

```javascript
* * * * * *
@Scheduled(cron = "[Seconds] [Minutes] [Hours] [Day of month] [Month] [Day of week]
```

The **@Scheduled** annotation is used to trigger the **scheduler for a specific time period**.

```javascript
@Scheduled(cron = "0/10 * * * * *")
public void performTaskUsingCron(){
System.out.println("Regular task performed using Cron at "+ dateFormat.format(new Date()));
}
```
## 2.Fixed Rate
Fixed Rate scheduler is used to **execute the tasks at the specific time**.
It does not wait for the completion of previous task. The values should be in **milliseconds**.

```javascript
//Fires every 1 second
@Scheduled(fixedRate = 1000)
public void performTask() {
System.out.println("Regular task performed using fixedRate " + dateFormat.format(new Date()));
}
```

## 3.Fixed Delay
Fixed Delay scheduler is used to execute the tasks at a specific time.
It should wait for the **previous task completion**. The values should be in
milliseconds.

```javascript
//Runs every second but waits 5 seconds before it executes for the first time
@Scheduled(fixedRate = 1000, initialDelay = 5000)
public void performDelayedTask() {
System.out.println("Delayed Regular task performed using fixedRate " + dateFormat.format(new Date()));
}
```

##Special characters mean.

*  * represents all values. So, if it is used in the second field, it means every second. If it is used in the day field, it means run every day.

* ? represents no specific value and can be used in either the day of month or day of week field — where using one invalidates the other. If we specify it to trigger on the 15th day of a month, then a ? will be used in the Day of week field.

* - represents an inclusive range of values. For example, 1-3 in the hours field means the hours 1, 2, and 3.

* , represents additional values. For example, putting MON,WED,SUN in the day of week field means on Monday, Wednesday, and Sunday.

* / represents increments. For example 0/15 in the seconds field triggers every 15 seconds starting from 0 (0, 15, 3,0 and 45).

* L represents the last day of the week or month. Remember that Saturday is the end of the week in this context, so using L in the day of week field will trigger on a Saturday. This can be used in conjunction with a number in the day of month field, such as 6L to represent the last Friday of the month or an expression like L3 denoting the third from the last day of the month. If we specify a value in the day of week field, we must use ? in the day of month field, and vice versa.

* W represents the nearest weekday of the month. For example, 15W will trigger on the 15th day of the month if it is a weekday. Otherwise, it will run on the closest weekday. This value cannot be used in a list of day values.

* #specifies both the day of the week and the week that the task should trigger. For example, 5#2 means the second Thursday of the month. If the day and week you specified overflows into the next month, then it will not trigger.



 ```javascript
 * Fires at 10 PM every day:
 @Scheduled(cron = "0 0 10 * * ?")
 ```
```javascript
* Fires at 11:10 AM every day in the year 2009:
@Scheduled(cron = "0 10 11 * * ? 2009")
```
```javascript
* Fires every 10 seconds:
 @Scheduled(cron = "0/10 * * * * ?")
```
