# NanoSession
in memory session for  http://nanohttpd.org

```java
public interface ISession {
		public String get(String key);//get session, if first time then session will be created

		public void set(String key, String value);//set session, if first time then session will be created

		public void clear();// clear session and delete from memory

		public boolean isExits();// check session is already created or not

		public void setExpireTime(int minute);// set expire time for session in minute, default 30 minute
		
		//session will be clear automatically after expire time, if before expire time access session then time start from 0 
	}
```
