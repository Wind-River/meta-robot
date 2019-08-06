
DESCRIPTION = "Micro XRCE Client for ROS 2"
SECTION = "turtlebot3"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

PACKAGES = "${PN}"



SRCREV = "1a113ee584000e23bf7816819f74d61432d7c807"
#PV = "1.1+gitr${SRCPV}"
DEPENDS = " microcdr boost spdlog "

SRC_URI = "https://github.com/eProsima/Micro-XRCE-DDS-Client/archive/v1.1.0.tar.gz;name=xrce file://mtu.patch file://makebuildlidar.patch https://github.com/ROBOTIS-GIT/turtlebot3/raw/ros2/turtlebot3_sbc_settings/dashing/tb3_sbc_settings.tar.bz2;subdir=${WORKDIR}/Micro-XRCE-DDS-Client-1.1.0/examples;name=sbc"
SRC_URI[sbc.md5sum] = "26304f9ba0e5a71609cb0d33ac2d6ec4"
SRC_URI[xrce.md5sum] = "79d5f0e67c885879aa6b6ee86e284ce3"

#SRC_URI[sha256sum] = "5571f2d3d946549c50d6c64119eb113527cdc2e64264ef9cbd62f9684c790e32"
S = "${WORKDIR}/Micro-XRCE-DDS-Client-1.1.0"

do_configure_prepend(){
#    rm -r ${S}/examples
#    mkdir ${S}/examples
#    rm ${S}/examples/turtlebot3_lidar/AMENT_IGNORE
#    cp -r ${S}/../tb3_sbc_settings/turtlebot3_lidar ${S}/examples 
#    bbwarn "Moving LIDAR examples"
}

do_install_append(){
    install -d ${D}/root/turtlebot3
#    install -m 0644 ${WORKDIR}/package/usr/examples/uxr/client/turtlebot3_lidar/bin/turtlebot3_lidar ${D}/root/turtlebot3
    cp ${D}/usr/examples/uxr/client/turtlebot3_lidar/bin/turtlebot3_lidar ${D}/root/turtlebot3
    install -m 0644 ${S}/examples/tb3_sbc_settings/tb3_fastrtps_profile.refs ${D}/root/turtlebot3
}
inherit cmake
INSANE_SKIP_${PN} = "installed-vs-shipped"
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"


FILES_${PN} += " ${prefix}/examples/* "
FILES_${PN}-dev += " ${prefix}/examples/* ${includedir} "
FILES_${PN} += " /root/turtlebot3/* "

BBCLASSEXTEND = "native"
