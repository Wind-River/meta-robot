
DESCRIPTION = "Google Test Library"
SECTION = "turtlebot3_ws"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cbbd27594afd089daa160d3a16dd515a"
SRC_URI = "git://github.com/ament/googletest.git;branch=${ROS_DISTRO}"

SRCREV = "2ba0f63751cd94815a9aff30f85579fedc7f0e16"
inherit cmake
SRC_URI[md5sum] = "ffccaed9330787c7442b453f6520a474"

S = "${WORKDIR}/git/googletest"
FILES_${PN} += " /usr/* "

BBCLASSEXTEND = "native"
