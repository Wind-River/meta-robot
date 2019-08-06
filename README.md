# meta-robot
## Overview
meta-robot provides recipes for controlling common ROS 2 reference robots. Currently the Turtlebot3 is supported.
## License
This project is licensed under the BSD 3-Clause License. See LICENSE-NOTICES.txt for the license text.
## Installation
Clone this layer to your layers directory and add its path to your bblayers.conf file. The following recipes can then be appended to your image:
opencr: provides OpenCR firmware
micro-xrce-dds-client: provides Turtlebot3 LIDAR client
turtlebot3: provides ROS 2 nodes for Turtlebot3 control
colcon-common-extensions: provides buildtool for building ROS 2 nodes directly on the target