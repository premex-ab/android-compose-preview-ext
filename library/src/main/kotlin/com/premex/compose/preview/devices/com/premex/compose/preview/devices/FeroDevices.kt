package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Fero device specifications for Android Compose previews.
 *
 * This extension provides Fero device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fero.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fero: Any
  get() = object {
      /** DeviceSpec(manufacturer=Fero, code=A4001_Plus_2019, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fero, code=A4001_Plus_2019,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val A4001_PLUS_2019 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Fero, code=A5003_512, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fero, code=A5003_512, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val A5003_512 = "spec:width=480,height=854,unit=px,dpi=240"

  }
