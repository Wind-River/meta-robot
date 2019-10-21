
DESCRIPTION = "Micro XRCE Client for ROS 2"
SECTION = "turtlebot3"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

PACKAGES = "${PN}"



SRCREV = "1a113ee584000e23bf7816819f74d61432d7c807"

DEPENDS = " microcdr boost spdlog "

SRC_URI = "https://github.com/eProsima/Micro-XRCE-DDS-Client/archive/v1.1.1.tar.gz \
	file://mtu.patch \
	file://tb3_fastrtps_profile.refs"
SRC_URI[md5sum] = "d607b0ea24cf166f27f0fad8f2fa557a"
#	file://makebuildlidar.patch



S = "${WORKDIR}/Micro-XRCE-DDS-Client-1.1.1"

do_install_append(){
    install -d ${D}/opt/turtlebot3
    install -m 0644 ${WORKDIR}/tb3_fastrtps_profile.refs ${D}/opt/turtlebot3
}
inherit cmake
INSANE_SKIP_${PN} = "installed-vs-shipped"
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"


FILES_${PN} += " ${prefix}/examples/* "
FILES_${PN}-dev += " ${prefix}/examples/* ${includedir} "
FILES_${PN} += " /opt/turtlebot3/* "

BBCLASSEXTEND = "native"
