package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TESLA device specifications for Android Compose previews.
 *
 * This extension provides TESLA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TESLA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TESLA: Any
  get() = object {
      /** DeviceSpec(manufacturer=TESLA, code=Tesla_SP9_1_Lite, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TESLA, code=Tesla_SP9_1_Lite,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val TESLA_SP9_1_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

  }
