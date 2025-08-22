package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * mu device specifications for Android Compose previews.
 *
 * This extension provides mu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mu: Any
  get() = object {
      /** DeviceSpec(manufacturer=mu, code=mu6, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mu, code=mu6, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val MU6 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=mu, code=mu_1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mu, code=mu_1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val MU_1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=mu, code=8, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mu, code=8, width=720, height=1560,
      dpi=320, isGoogleDevice=false).code */
      val _8 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
