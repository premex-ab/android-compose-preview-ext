package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Trident device specifications for Android Compose previews.
 *
 * This extension provides Trident device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Trident.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Trident: Any
  get() = object {
      /** DeviceSpec(manufacturer=Trident, code=A23_Max, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Trident, code=A23_Max, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val A23_MAX = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Trident, code=A24, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Trident, code=A24, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val A24 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Trident, code=A25, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Trident, code=A25, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val A25 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Trident, code=A43, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Trident, code=A43, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A43 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Trident, code=A53_PRO, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Trident, code=A53_PRO, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val A53_PRO = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Trident, code=A54, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Trident, code=A54, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val A54 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Trident, code=A55, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Trident, code=A55, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A55 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Trident, code=A60, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Trident, code=A60, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val A60 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Trident, code=A75, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Trident, code=A75, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val A75 = "spec:width=1080,height=2460,unit=px,dpi=480"

  }
