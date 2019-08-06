
DESCRIPTION = "Colcon Build Tool"
SECTION = "turtlebot3_ws"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"



PV = "4.5.3"

inherit pypi setuptools3
SRC_URI[md5sum] = "8dd15f484da8b3088288c8cd72ed881b"
PYPI_PACKAGE = "coverage"


BBCLASSEXTEND = "native"
