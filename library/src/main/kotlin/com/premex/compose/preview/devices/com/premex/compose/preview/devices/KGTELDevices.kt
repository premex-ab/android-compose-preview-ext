package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KGTEL device specifications for Android Compose previews.
 *
 * This extension provides KGTEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KGTEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KGTEL: Any
  get() = object {
      /** DeviceSpec(manufacturer=KGTEL, code=A56, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KGTEL, code=A56, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val A56 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KGTEL, code=Better10, width=480, height=960, dpi=216,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KGTEL, code=Better10, width=480,
      height=960, dpi=216, isGoogleDevice=false).code */
      val BETTER10 = "spec:width=480,height=960,unit=px,dpi=216"

      /** DeviceSpec(manufacturer=KGTEL, code=Hello_10_Pro_4G, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KGTEL, code=Hello_10_Pro_4G,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val HELLO_10_PRO_4G = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KGTEL, code=Mate20_Pro_4G, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KGTEL, code=Mate20_Pro_4G,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val MATE20_PRO_4G = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KGTEL, code=Nova_10_Pro_4G, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KGTEL, code=Nova_10_Pro_4G,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val NOVA_10_PRO_4G = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KGTEL, code=R10A, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KGTEL, code=R10A, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val R10A = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KGTEL, code=X55E, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KGTEL, code=X55E, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val X55E = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=KGTEL, code=X5A, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KGTEL, code=X5A, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val X5A = "spec:width=540,height=960,unit=px,dpi=240"

  }
