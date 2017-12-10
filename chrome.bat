::Beginning the batch file
set SERVER_VERSION=3.8.1
set TASK_NAME=SeleniumServerNode2
set HUB_PORT=5557
set REGISTER_IP=localhost:4444
set CHROME_DRIVER=chromedriver.exe
java -jar selenium-server-standalone-%SERVER_VERSION%.jar 
-webdriver.chrome.driver=%CHOME_DRIVER% -role node -hub
http://%REGISTER_IP%/grid/register -browser browserName=chrome.platform=WINDOWS
-port %HUB_PORT%
::End the batch file
