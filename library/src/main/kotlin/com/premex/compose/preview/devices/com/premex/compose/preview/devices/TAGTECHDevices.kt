package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TAG-TECH device specifications for Android Compose previews.
 *
 * This extension provides TAG-TECH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TAGTECH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TAGTECH: Any
  get() = object {
      /** DeviceSpec(manufacturer=TAG-TECH, code=TAG_TAB_II, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TAG-TECH, code=TAG_TAB_II,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val TAG_TAB_II = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
