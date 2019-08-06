
DESCRIPTION = "Colcon Build Tool"
SECTION = "turtlebot3_ws"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=dda57cad474b0e1f8afc605c6d43b67d"



PV = "0.2.4"

inherit pypi setuptools3
SRC_URI[md5sum] = "97a3f09fd793a611ea82870fd4d08264"
PYPI_PACKAGE = "colcon-parallel-executor"


BBCLASSEXTEND = "native"
