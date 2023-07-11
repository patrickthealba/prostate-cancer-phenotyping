package listeners

import gov.va.vinci.leo.listener.SimpleXmiListener
import gov.va.vinci.leo.tools.LeoUtils

String timeStamp = LeoUtils.getTimestampDateDotTime().replaceAll("[.]", "_")
String xmiDir =  "data/output/xmi/"
String pathToFiles =  "data\\Input\\"


if(!(new File(xmiDir)).exists()) (new File(xmiDir)).mkdirs()

listener = new SimpleXmiListener(new File(xmiDir))
//TODO Confirm location name here
listener.setTypeSystemDescriptor(new File(xmiDir))
listener.setLaunchAnnotationViewer(true)

