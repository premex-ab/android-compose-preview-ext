package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RADDY device specifications for Android Compose previews.
 *
 * This extension provides RADDY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RADDY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RADDY: Any
  get() = object {
      /** DeviceSpec(manufacturer=RADDY, code=RADDY_JANJA, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RADDY, code=RADDY_JANJA, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val RADDY_JANJA = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RADDY, code=RADDY_JANJA_PRO, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RADDY, code=RADDY_JANJA_PRO,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val RADDY_JANJA_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

  }
