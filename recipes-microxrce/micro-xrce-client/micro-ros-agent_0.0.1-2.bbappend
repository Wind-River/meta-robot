
do_install_append(){
    install -d ${D}/root/turtlebot3
    cp ${D}${base_prefix}/usr/lib/micro_ros_agent/DEFAULT_FASTRTPS_PROFILES.xml ${D}${base_prefix}/root/turtlebot3
}

FILES_${PN} += " /root/turtlebot3/DEFAULT_FASTRTPS_PROFILES.xml "
