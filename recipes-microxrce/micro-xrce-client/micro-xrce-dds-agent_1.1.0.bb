
inherit ros_distro_${ROS_DISTRO}

DESCRIPTION = "DDS-XCRE agent implementation"
AUTHOR = "Borja Outerelo <borjaouterelo@eprosima.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"



ROS_CN = "micro-xrce-dds-agent"
ROS_BPN = "micro-xrce-dds-agent"

ROS_BUILD_DEPENDS = " \
    asio \
    fastcdr \
    fastrtps \
    cli11 \
    micro-xrce-dds-client \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    fastcdr \
    fastrtps \
    cli11 \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    fastcdr \
    fastrtps \
    cli11 \
    micro-ros-agent \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/eProsima/Micro-XRCE-DDS-Agent/archive/v1.1.0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9f2e3d608310e05268a4478f55bfb31e"
#SRC_URI[sha256sum] = "2527ae37b394541a98465ecdfbf05b9de141c0b66a1675ccf19f7e149d7ff765"
S = "${WORKDIR}/Micro-XRCE-DDS-Agent-1.1.0"

ROS_BUILD_TYPE = "cmake"

# Allow the above settings to be overridden.
#ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('micro-xrce-dds-agent', d)}"
#include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/micro-xrce-dds-agent/micro-xrce-dds-agent_common.inc
#include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/micro-xrce-dds-agent/micro-xrce-dds-agent-${PV}_common.inc
#include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/micro-xrce-dds-agent/${BPN}.inc
#include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/micro-xrce-dds-agent/${BPN}-${PV}.inc

inherit ros2_component
inherit ros_${ROS_BUILD_TYPE}

INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

INSANE_SKIP_${PN} += " dev-so "

EXTRA_OECMAKE += " -DTHIRDPARTY=OFF -DCONFIG_UDP_TRANSPORT_MTU=8192 -DCONFIG_SERIAL_TRANSPORT_MTU=8192 -DTHIRDPARTYUPDATE=OFF -DUAGENT_SUPERBUILD=OFF "