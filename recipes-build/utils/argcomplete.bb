
DESCRIPTION = "Colcon Build Tool"
SECTION = "turtlebot3_ws"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=2ee41112a44fe7014dce33e26468ba93"


PV = "1.10.0"

inherit pypi setuptools3
SRC_URI[sha256sum] = "45836de8cc63d2f6e06b898cef1e4ce1e9907d246ec77ac8e64f23f153d6bec1"

PYPI_PACKAGE = "argcomplete"


BBCLASSEXTEND = "native"
