
LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = "file://PKG-INFO;md5=dd15b942d7f8b49a92d87a642707876f"
DESCRIPTION = "Colcon Build Tool"
SECTION = "turtlebot3_ws"


RDEPENDS_${PN} += " python-latestdateutil python3-pytest-runner python3-distutils python3-empy python-latestpytest coverage distlib docutils notify2 pytest-cov pytest-repeat pytest-rerunfailures python-dateutil colcon-pkg-config"

PV = "0.3.22"

inherit pypi setuptools3
SRC_URI[md5sum] = "3cd13803c6c4629baf301cc0c665d69d"

PYPI_PACKAGE = "colcon-core"


BBCLASSEXTEND = "native"
