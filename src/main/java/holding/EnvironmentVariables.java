package holding;

import java.util.Map;

/**
 * Created by weixiao on 2018/10/23.
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for(Map.Entry entry:System.getenv().entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}/*output:
configsetroot:C:\WINDOWS\ConfigSetRoot
USERDOMAIN_ROAMINGPROFILE:WEIXIAO-PC
LOCALAPPDATA:C:\Users\weixiao\AppData\Local
PROCESSOR_LEVEL:6
USERDOMAIN:WEIXIAO-PC
LOGONSERVER:\\WEIXIAO-PC
JAVA_HOME:D:\Java\jdk1.8
SESSIONNAME:Console
ALLUSERSPROFILE:C:\ProgramData
PROCESSOR_ARCHITECTURE:AMD64
LANG:zh_CN.GBK
PSModulePath:C:\Program Files\WindowsPowerShell\Modules;C:\WINDOWS\system32\WindowsPowerShell\v1.0\Modules
SystemDrive:C:
OneDrive:C:\Users\weixiao\OneDrive
APPDATA:C:\Users\weixiao\AppData\Roaming
USERNAME:weixiao
ProgramFiles(x86):C:\Program Files (x86)
CommonProgramFiles:C:\Program Files\Common Files
Path:D:\OracleXE\app\oracle\product\11.2.0\server\bin;C:\Program Files (x86)\Intel\iCLS Client\;C:\Program Files\Intel\iCLS Client\;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files\Intel\Intel(R) Management Engine Components\IPT;D:\Java\jdk1.8\bin;D:\Vim\vim80;D:\Program Files\TortoiseSVN\bin;D:\goldenseasoft\android\android-sdk\platform-tools;D:\goldenseasoft\android\android-sdk\tools;D:\Mysql\mysql-5.6.36-winx64\bin;C:\WINDOWS\System32\OpenSSH\;D:\Maven\apache-maven-3.3.3\bin;D:\Git\bin;D:\Git\cmd;C:\Program Files\Intel\WiFi\bin\;C:\Program Files\Common Files\Intel\WirelessCommon\;C:\Users\weixiao\AppData\Local\Microsoft\WindowsApps;C:\Users\weixiao\AppData\Local\GitHubDesktop\bin;D:\Program Files (x86)\IDM Computer Solutions\UltraEdit\;%USERPROFILE%\AppData\Local\Microsoft\WindowsApps;
PATHEXT:.COM;.EXE;.BAT;.CMD;.VBS;.VBE;.JS;.JSE;.WSF;.WSH;.MSC
DriverData:C:\Windows\System32\Drivers\DriverData
OS:Windows_NT
COMPUTERNAME:WEIXIAO-PC
PROCESSOR_REVISION:8e09
CLASSPATH:.;D:\Java\jdk1.8\lib\dt.jar;D:\Java\jdk1.8\lib\tools.jar;
CommonProgramW6432:C:\Program Files\Common Files
NLS_LANG:SIMPLIFIED CHINESE_CHINA.ZHS16GBK
ComSpec:C:\WINDOWS\system32\cmd.exe
ProgramData:C:\ProgramData
ProgramW6432:C:\Program Files
HOMEPATH:\Users\weixiao
SystemRoot:C:\WINDOWS
TEMP:C:\Users\weixiao\AppData\Local\Temp
HOMEDRIVE:C:
PROCESSOR_IDENTIFIER:Intel64 Family 6 Model 142 Stepping 9, GenuineIntel
USERPROFILE:C:\Users\weixiao
TMP:C:\Users\weixiao\AppData\Local\Temp
M2_HOME:D:\Maven\apache-maven-3.3.3
CommonProgramFiles(x86):C:\Program Files (x86)\Common Files
ProgramFiles:C:\Program Files
PUBLIC:C:\Users\Public
NUMBER_OF_PROCESSORS:4
windir:C:\WINDOWS
=:::::\
HOME:C:\Users\weixiao
*/
