# Last Modified: Sun Jan 26 01:30:15 2014
#include <tunables/global>

/var/jetendo-server/railo/jdk/jre/bin/java {
  #include <abstractions/apache2-common>
  #include <abstractions/base>
  #include <abstractions/fonts>
  #include <abstractions/nameservice>


  /anon_hugepage//deleted mr,
  /bin/ls rix,
  /bin/chmod rix,
  /etc/lsb-release r,
  /var/cache/fontconfig/** r,
  /etc/debian_version r,
  /proc/loadavg r,
  /etc/timezone r,
  /var/jetendo-server/jetendo/core/ r,
  /var/jetendo-server/jetendo/core/** r,
  /var/jetendo-server/jetendo/database-upgrade/ r,
  /var/jetendo-server/jetendo/database-upgrade/** r,
  /var/jetendo-server/jetendo/sites/WEB-INF/ rw,
  /var/jetendo-server/jetendo/sites/WEB-INF/** rw,
  /var/jetendo-server/railo/tomcat/webapps/*/WEB-INF/ rw,
  /var/jetendo-server/railo/tomcat/webapps/*/WEB-INF/** rw,
  /var/jetendo-server/jetendo/sites/*/WEB-INF/ rw,
  /var/jetendo-server/jetendo/sites/*/WEB-INF/** rw,
  /var/jetendo-server/jetendo/execute/ rw,
  /var/jetendo-server/jetendo/execute/** rw,
  /var/jetendo-server/jetendo/public/ r,
  /var/jetendo-server/jetendo/public/** r,
  /var/jetendo-server/railovhosts/ rw,
  /var/jetendo-server/railovhosts/** rw,
  /var/jetendo-server/jetendo/share/ rw,
  /var/jetendo-server/jetendo/share/** rw,
  /var/jetendo-server/jetendo/sites-writable/ rw,
  /var/jetendo-server/jetendo/sites-writable/** rw,
  /var/jetendo-server/jetendo/sites rw,
  /var/jetendo-server/jetendo/sites/ r,
  /var/jetendo-server/jetendo/sites/** r,
  /var/jetendo-server/jetendo/themes/ r,
  /var/jetendo-server/jetendo/themes/** r,
  /var/jetendo-server/railo/ r,
  /var/jetendo-server/railo/** r,
  /var/jetendo-server/railo/jdk/jre/bin/java mrix,
  /var/jetendo-server/railo/jdk/jre/lib/amd64/** mr,
  /var/jetendo-server/railo/lib/** rw,
  /var/jetendo-server/railo/tomcat/conf/Catalina/ rw,
  /var/jetendo-server/railo/tomcat/conf/Catalina/** rw,
  /var/jetendo-server/railo/tomcat/hs_err_pid*.log rw,
  /var/jetendo-server/railo/tomcat/jmimemagic.log rw,
  /var/jetendo-server/railo/tomcat/logs/ rw,
  /var/jetendo-server/railo/tomcat/logs/** rw,
  /var/jetendo-server/railo/tomcat/temp/** mrw,
  /var/jetendo-server/railo/tomcat/webapps/ROOT/WEB-INF/ rw,
  /var/jetendo-server/railo/tomcat/webapps/ROOT/WEB-INF/** rw,
  /var/jetendo-server/railo/tomcat/work/** rw,
  /proc/*/coredump_filter rw,
  /proc/*/fd/ r,
  /proc/*/net/if_inet6 r,
  /proc/*/net/ipv6_route r,
  /proc/filesystems r,
  /sys/devices/system/cpu/ r,
  /tmp/hsperfdata_www-data/ rw,
  /tmp/hsperfdata_www-data/** rw,
  /usr/lib{,32,64}/** mr,
  /usr/local/apr/lib/lib*so* mr,
  /usr/share/poppler/cMap/** r,
  /var/jetendo-server/backup/jetendo/share/ rw,
  /var/jetendo-server/backup/jetendo/share/** rw,
  /var/jetendo-server/backup/backup/ rw,
  /var/jetendo-server/backup/backup/** rw,
  /zbackup/backup/ rw,
  /zbackup/backup/** rw,

}
