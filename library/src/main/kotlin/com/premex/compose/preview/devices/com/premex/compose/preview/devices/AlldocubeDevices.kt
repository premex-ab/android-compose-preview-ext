package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Alldocube device specifications for Android Compose previews.
 *
 * This extension provides Alldocube device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Alldocube.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Alldocube: Any
  get() = object {
      /** DeviceSpec(manufacturer=Alldocube, code=iPlay50_mini_Pro, width=1200, height=1920,
      dpi=360, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube,
      code=iPlay50_mini_Pro, width=1200, height=1920, dpi=360, isGoogleDevice=false).code */
      val IPLAY50_MINI_PRO = "spec:width=1200,height=1920,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=Alldocube, code=iPlay60_mini, width=800, height=1340, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=iPlay60_mini,
      width=800, height=1340, dpi=213, isGoogleDevice=false).code */
      val IPLAY60_MINI = "spec:width=800,height=1340,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Alldocube, code=iPlay60_mini_Pro, width=1200, height=1920,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube,
      code=iPlay60_mini_Pro, width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val IPLAY60_MINI_PRO = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alldocube, code=iPlay60_Pro, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=iPlay60_Pro,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val IPLAY60_PRO = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Alldocube, code=iPlay60_S_4G, width=800, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=iPlay60_S_4G,
      width=800, height=1280, dpi=320, isGoogleDevice=false).code */
      val IPLAY60_S_4G = "spec:width=800,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alldocube, code=iPlay_20, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=iPlay_20,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val IPLAY_20 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alldocube, code=iPlay_70_Pro, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=iPlay_70_Pro,
      width=1600, height=2560, dpi=320, isGoogleDevice=false).code */
      val IPLAY_70_PRO = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alldocube, code=iPlay_70_S, width=1280, height=1920, dpi=210,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=iPlay_70_S,
      width=1280, height=1920, dpi=210, isGoogleDevice=false).code */
      val IPLAY_70_S = "spec:width=1280,height=1920,unit=px,dpi=210"

      /** DeviceSpec(manufacturer=Alldocube, code=KidzPad_Pro, width=1200, height=1920, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=KidzPad_Pro,
      width=1200, height=1920, dpi=360, isGoogleDevice=false).code */
      val KIDZPAD_PRO = "spec:width=1200,height=1920,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=Alldocube, code=Smile_1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=Smile_1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SMILE_1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Alldocube, code=T1012, width=1200, height=1920, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=T1012, width=1200,
      height=1920, dpi=360, isGoogleDevice=false).code */
      val T1012 = "spec:width=1200,height=1920,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=Alldocube, code=T1016, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=T1016, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val T1016 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alldocube, code=T1020H, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=T1020H, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val T1020H = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alldocube, code=T1020S, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=T1020S, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val T1020S = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alldocube, code=T1021, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=T1021, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val T1021 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alldocube, code=T1021P, width=1200, height=1920, dpi=350,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=T1021P, width=1200,
      height=1920, dpi=350, isGoogleDevice=false).code */
      val T1021P = "spec:width=1200,height=1920,unit=px,dpi=350"

      /** DeviceSpec(manufacturer=Alldocube, code=T1021PM, width=1200, height=1920, dpi=380,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=T1021PM,
      width=1200, height=1920, dpi=380, isGoogleDevice=false).code */
      val T1021PM = "spec:width=1200,height=1920,unit=px,dpi=380"

      /** DeviceSpec(manufacturer=Alldocube, code=T1021T, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=T1021T, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val T1021T = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alldocube, code=T1023, width=1280, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=T1023, width=1280,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val T1023 = "spec:width=1280,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alldocube, code=T1026, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=T1026, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val T1026 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alldocube, code=T1028, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=T1028, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val T1028 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alldocube, code=T1029T, width=800, height=1280, dpi=210,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=T1029T, width=800,
      height=1280, dpi=210, isGoogleDevice=false).code */
      val T1029T = "spec:width=800,height=1280,unit=px,dpi=210"

      /** DeviceSpec(manufacturer=Alldocube, code=T1029TA, width=800, height=1280, dpi=210,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=T1029TA, width=800,
      height=1280, dpi=210, isGoogleDevice=false).code */
      val T1029TA = "spec:width=800,height=1280,unit=px,dpi=210"

      /** DeviceSpec(manufacturer=Alldocube, code=T1030, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=T1030, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val T1030 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alldocube, code=T1030M, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=T1030M, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val T1030M = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alldocube, code=T1030MAN, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=T1030MAN,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val T1030MAN = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alldocube, code=T1030X, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=T1030X, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val T1030X = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alldocube, code=T1102T, width=1200, height=2000, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=T1102T, width=1200,
      height=2000, dpi=360, isGoogleDevice=false).code */
      val T1102T = "spec:width=1200,height=2000,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=Alldocube, code=T1103T, width=800, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=T1103T, width=800,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val T1103T = "spec:width=800,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alldocube, code=T1201, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=T1201, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val T1201 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alldocube, code=T701_X, width=720, height=1280, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=T701_X, width=720,
      height=1280, dpi=300, isGoogleDevice=false).code */
      val T701_X = "spec:width=720,height=1280,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=Alldocube, code=T802, width=800, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=T802, width=800,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val T802 = "spec:width=800,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alldocube, code=U1008, width=1280, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=U1008, width=1280,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val U1008 = "spec:width=1280,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Alldocube, code=U1030, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=U1030, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val U1030 = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Alldocube, code=U1033, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=U1033, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val U1033 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Alldocube, code=U807, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=U807, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val U807 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Alldocube, code=U812, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Alldocube, code=U812, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val U812 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
