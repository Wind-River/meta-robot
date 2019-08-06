
DESCRIPTION = "Micro XRCE Client for ROS 2"
SECTION = "turtlebot3"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"



inherit cmake

SRCREV = "925348832bdd2f5975bb4acd8b16014ea681c22a"
#PV = "1.1+gitr${SRCPV}"

SRC_URI = "git://github.com/eProsima/Micro-CDR.git"
SRC_URI[md5sum] = "239f3032f6875346f5ea123dfbe6eb0b"



#SRC_URI[sha256sum] = "5571f2d3d946549c50d6c64119eb113527cdc2e64264ef9cbd62f9684c790e32"
S = "${WORKDIR}/git"
BBCLASSEXTEND = "native"
