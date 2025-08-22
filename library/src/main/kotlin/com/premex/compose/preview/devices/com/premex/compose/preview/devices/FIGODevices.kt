package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FIGO device specifications for Android Compose previews.
 *
 * This extension provides FIGO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FIGO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FIGO: Any
  get() = object {
      /** DeviceSpec(manufacturer=FIGO, code=Orbit_ll, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FIGO, code=Orbit_ll, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val ORBIT_LL = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=FIGO, code=Telecell, width=480, height=960, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FIGO, code=Telecell, width=480,
      height=960, dpi=180, isGoogleDevice=false).code */
      val TELECELL = "spec:width=480,height=960,unit=px,dpi=180"

  }
