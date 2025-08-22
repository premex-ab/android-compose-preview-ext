package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ALPHAWOLF device specifications for Android Compose previews.
 *
 * This extension provides ALPHAWOLF device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ALPHAWOLF.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ALPHAWOLF: Any
  get() = object {
      /** DeviceSpec(manufacturer=ALPHAWOLF, code=A1, width=1600, height=2560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALPHAWOLF, code=A1, width=1600,
      height=2560, dpi=320, isGoogleDevice=false).code */
      val A1 = "spec:width=1600,height=2560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ALPHAWOLF, code=L1, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALPHAWOLF, code=L1, width=1200,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val L1 = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ALPHAWOLF, code=L2, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALPHAWOLF, code=L2, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val L2 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ALPHAWOLF, code=L3, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALPHAWOLF, code=L3, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val L3 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
