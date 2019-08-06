
do_install_append(){
    install -d ${D}/opt/turtlebot3
    cp ${D}${base_prefix}/usr/lib/micro_ros_agent/DEFAULT_FASTRTPS_PROFILES.xml ${D}${base_prefix}/opt/turtlebot3
}

FILES_${PN} += " /opt/turtlebot3/DEFAULT_FASTRTPS_PROFILES.xml "
