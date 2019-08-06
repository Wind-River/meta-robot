
do_install_append(){
    install -d ${D}/usr/lib/turtlebot3_node
    install -m 0644 ${WORKDIR}/build/libturtlebot3_node_LIB.so ${D}/usr/lib/turtlebot3_node
}
FILES_${PN} += " /usr/lib/turtlebot3_node/libturtlebot3_node_LIB.so "
