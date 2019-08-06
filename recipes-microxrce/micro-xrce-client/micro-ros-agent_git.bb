
inherit ros_distro_${ROS_DISTRO}

DESCRIPTION = "DDS-XCRE agent implementation"
AUTHOR = "Borja Outerelo <borjaouterelo@eprosima.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;md5=41748e3b591517667e817fd97cb5a168"



ROS_CN = "micro-ros-agent"
ROS_BPN = "micro-ros-agent"

ROS_BUILD_DEPENDS = " \
    fastcdr \
    fastrtps \
    rosidl-cmake \
    ament-cmake \
    ament-cmake-libraries \
    ament-package \
    micro-xrce-dds-agent \
    builtin-interfaces \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    fastcdr \
    rosidl-cmake \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    fastcdr \
    rosidl-cmake \
    ament-cmake-libraries \
    ament-package \
    fastrtps \
    rclcpp \
    rosidl-parser \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = " gtest ${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += " ${ROS_EXEC_DEPENDS}"
SRCREV = "3b78eee980ab569b9ad4e2bd3d65d5c7e21e7fac"
SRC_URI = "git://github.com/micro-ROS/micro-ROS-Agent.git;branch=feature/dashing_migration file://logging.patch"
SRC_URI[md5sum] = "41748e3b591517667e817fd97cb5a168"
#SRC_URI[sha256sum] = "2527ae37b394541a98465ecdfbf05b9de141c0b66a1675ccf19f7e149d7ff765"
S = "${WORKDIR}/git/micro_ros_agent"

ROS_BUILD_TYPE = "ament_cmake"



inherit ros2_component
inherit ros_${ROS_BUILD_TYPE}



EXTRA_OECMAKE += ""

do_install_append(){
    install -d ${D}/opt/turtlebot3
    cp ${D}${base_prefix}/usr/lib/micro_ros_agent/DEFAULT_FASTRTPS_PROFILES.xml ${D}${base_prefix}/opt/turtlebot3
}

FILES_${PN} += " /opt/turtlebot3/DEFAULT_FASTRTPS_PROFILES.xml "
