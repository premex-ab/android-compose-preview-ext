package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * INSYS device specifications for Android Compose previews.
 *
 * This extension provides INSYS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.INSYS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.INSYS: Any
  get() = object {
      /** DeviceSpec(manufacturer=INSYS, code=GW2-L1049, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INSYS, code=GW2-L1049, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val GW2_L1049 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=INSYS, code=HN2-M16P, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INSYS, code=HN2-M16P, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val HN2_M16P = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=INSYS, code=HN2-M16Q, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INSYS, code=HN2-M16Q, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val HN2_M16Q = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=INSYS, code=IH8-S559, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INSYS, code=IH8-S559, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val IH8_S559 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=INSYS, code=IH9-L614, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INSYS, code=IH9-L614, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val IH9_L614 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=INSYS, code=WH2-9832, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=INSYS, code=WH2-9832, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val WH2_9832 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
