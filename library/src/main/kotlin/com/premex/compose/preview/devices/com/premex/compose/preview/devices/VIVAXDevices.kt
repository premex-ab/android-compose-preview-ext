package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VIVAX device specifications for Android Compose previews.
 *
 * This extension provides VIVAX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VIVAX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VIVAX: Any
  get() = object {
      /** DeviceSpec(manufacturer=VIVAX, code=FUN_S20, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIVAX, code=FUN_S20, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val FUN_S20 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VIVAX, code=longshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIVAX, code=longshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VIVAX, code=MID7015A-MK, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIVAX, code=MID7015A-MK, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MID7015A_MK = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VIVAX, code=Point_X2, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIVAX, code=Point_X2, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val POINT_X2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VIVAX, code=Point_X502, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIVAX, code=Point_X502, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val POINT_X502 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=VIVAX, code=Point_X503, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIVAX, code=Point_X503, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val POINT_X503 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VIVAX, code=stanford, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIVAX, code=stanford, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VIVAX, code=TPC-102_4G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIVAX, code=TPC-102_4G, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TPC_102_4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VIVAX, code=TPC_8043G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIVAX, code=TPC_8043G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TPC_8043G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VIVAX, code=TPC_8053G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIVAX, code=TPC_8053G, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TPC_8053G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VIVAX, code=TPC_8063G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIVAX, code=TPC_8063G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TPC_8063G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VIVAX, code=TPC_8074G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIVAX, code=TPC_8074G, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TPC_8074G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VIVAX, code=VIVAX_Fly6, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIVAX, code=VIVAX_Fly6, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val VIVAX_FLY6 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=VIVAX, code=VIVAX_Fly_V1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIVAX, code=VIVAX_Fly_V1,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val VIVAX_FLY_V1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VIVAX, code=VIVAX_PRO3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIVAX, code=VIVAX_PRO3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val VIVAX_PRO3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VIVAX, code=VIVAX_TPC-105_4G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIVAX, code=VIVAX_TPC-105_4G,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val VIVAX_TPC_105_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VIVAX, code=zhongshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIVAX, code=zhongshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
