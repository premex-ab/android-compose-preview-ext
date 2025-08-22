package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NAVCITY device specifications for Android Compose previews.
 *
 * This extension provides NAVCITY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NAVCITY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NAVCITY: Any
  get() = object {
      /** DeviceSpec(manufacturer=NAVCITY, code=NP752, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NAVCITY, code=NP752, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val NP752 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=NAVCITY, code=NP-752Go, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NAVCITY, code=NP-752Go, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val NP_752GO = "spec:width=480,height=854,unit=px,dpi=240"

  }
