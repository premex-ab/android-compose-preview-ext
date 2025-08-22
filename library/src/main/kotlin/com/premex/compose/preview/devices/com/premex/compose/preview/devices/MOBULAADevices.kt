package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MOBULAA device specifications for Android Compose previews.
 *
 * This extension provides MOBULAA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MOBULAA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MOBULAA: Any
  get() = object {
      /** DeviceSpec(manufacturer=MOBULAA, code=NOTE2, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MOBULAA, code=NOTE2, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val NOTE2 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MOBULAA, code=Note4, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MOBULAA, code=Note4, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val NOTE4 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=MOBULAA, code=S11, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MOBULAA, code=S11, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val S11 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MOBULAA, code=Tab-1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MOBULAA, code=Tab-1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_1 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
