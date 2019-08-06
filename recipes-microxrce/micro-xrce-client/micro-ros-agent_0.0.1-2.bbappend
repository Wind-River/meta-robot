# Copyright (c) 2019 Wind River Systems, Inc. 
# Licensed under the Apache License, Version 2.0 (the "License"); 
# you may not use this file except in compliance with the License. 
# You may obtain a copy of the License at: 
#       http://www.apache.org/licenses/LICENSE-2.0 
# Unless required by applicable law or agreed to in writing, software  distributed 
# under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES 
# OR CONDITIONS OF ANY KIND, either express or implied.

do_install_append(){
    install -d ${D}/root/turtlebot3
    cp ${D}${base_prefix}/usr/lib/micro_ros_agent/DEFAULT_FASTRTPS_PROFILES.xml ${D}${base_prefix}/root/turtlebot3
}

FILES_${PN} += " /root/turtlebot3/DEFAULT_FASTRTPS_PROFILES.xml "
