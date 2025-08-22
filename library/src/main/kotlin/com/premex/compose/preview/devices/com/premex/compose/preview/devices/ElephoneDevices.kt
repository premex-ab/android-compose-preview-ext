package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Elephone device specifications for Android Compose previews.
 *
 * This extension provides Elephone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Elephone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Elephone: Any
  get() = object {
      /** DeviceSpec(manufacturer=Elephone, code=A3_Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elephone, code=A3_Pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val A3_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Elephone, code=A4, width=720, height=1512, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elephone, code=A4, width=720,
      height=1512, dpi=320, isGoogleDevice=false).code */
      val A4 = "spec:width=720,height=1512,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Elephone, code=A4_Pro, width=720, height=1512, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elephone, code=A4_Pro, width=720,
      height=1512, dpi=320, isGoogleDevice=false).code */
      val A4_PRO = "spec:width=720,height=1512,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Elephone, code=A5, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elephone, code=A5, width=1080,
      height=2246, dpi=480, isGoogleDevice=false).code */
      val A5 = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Elephone, code=A6_Max, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elephone, code=A6_Max, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val A6_MAX = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Elephone, code=A6_mini, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elephone, code=A6_mini, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val A6_MINI = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Elephone, code=A7H, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elephone, code=A7H, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val A7H = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Elephone, code=E10, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elephone, code=E10, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val E10 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Elephone, code=E10_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elephone, code=E10_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val E10_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Elephone, code=Elephone_U, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elephone, code=Elephone_U,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val ELEPHONE_U = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Elephone, code=P11, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elephone, code=P11, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val P11 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Elephone, code=P8_3D, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elephone, code=P8_3D, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P8_3D = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Elephone, code=P8_Max, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elephone, code=P8_Max, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P8_MAX = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Elephone, code=PX, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elephone, code=PX, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PX = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Elephone, code=PX_Pro, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elephone, code=PX_Pro, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val PX_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Elephone, code=Soldier, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elephone, code=Soldier, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val SOLDIER = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=Elephone, code=U3H, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elephone, code=U3H, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val U3H = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Elephone, code=U5, width=1080, height=2310, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elephone, code=U5, width=1080,
      height=2310, dpi=480, isGoogleDevice=false).code */
      val U5 = "spec:width=1080,height=2310,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Elephone, code=U_Pro, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elephone, code=U_Pro, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val U_PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
