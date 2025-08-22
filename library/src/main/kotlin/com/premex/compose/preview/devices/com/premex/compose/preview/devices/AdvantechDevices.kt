package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Advantech device specifications for Android Compose previews.
 *
 * This extension provides Advantech device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Advantech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Advantech: Any
  get() = object {
      /** DeviceSpec(manufacturer=Advantech, code=AIM75-LTE, width=1200, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Advantech, code=AIM75-LTE,
      width=1200, height=1920, dpi=420, isGoogleDevice=false).code */
      val AIM75_LTE = "spec:width=1200,height=1920,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Advantech, code=AIM75-WIFI, width=1200, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Advantech, code=AIM75-WIFI,
      width=1200, height=1920, dpi=420, isGoogleDevice=false).code */
      val AIM75_WIFI = "spec:width=1200,height=1920,unit=px,dpi=420"

  }
