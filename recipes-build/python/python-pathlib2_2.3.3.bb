
DESCRIPTION = "Colcon Build Tool"
SECTION = "turtlebot3_ws"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=042856c23a3e903b33bf361ea1cbe29a"


PV = "2.3.3"

inherit pypi setuptools3
SRC_URI[md5sum] = "f9ede5c162ea6fc6a3b1d26db53bb6a2"

PYPI_PACKAGE = "pathlib2"


BBCLASSEXTEND = "native"
