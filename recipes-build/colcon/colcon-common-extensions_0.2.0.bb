
SECTION = "turtlebot3_ws"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=b9ec8cc1972d2d565f707e7149a9786c"

RDEPENDS_${PN} = " colcon-cmake colcon-core colcon-defaults colcon-devtools colcon-library-path colcon-metadata colcon-output colcon-package-information colcon-package-selection colcon-parallel-executor colcon-powershell colcon-python-setup-py colcon-recursive-crawl colcon-ros colcon-test-result colcon-bash colcon-zsh"
PV = "0.2.0"

inherit pypi setuptools3
SRC_URI[md5sum] = "e9c5e7f3050b0a80a5b36bca2d0549db"

PYPI_PACKAGE = "colcon-common-extensions"

BBCLASSEXTEND = "native"
