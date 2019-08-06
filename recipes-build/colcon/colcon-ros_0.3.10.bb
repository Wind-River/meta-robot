
DESCRIPTION = "Colcon Build Tool"
SECTION = "turtlebot3_ws"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=993ff28185bc99b008231dd1d31f2eaf"



RDEPENDS_${PN} = "docutils"

PV = "0.3.10"

inherit pypi setuptools3
SRC_URI[md5sum] = "442a731ad4a9f5dbbc76d2df282e0c2c"

PYPI_PACKAGE = "colcon-ros"


BBCLASSEXTEND = "native"
