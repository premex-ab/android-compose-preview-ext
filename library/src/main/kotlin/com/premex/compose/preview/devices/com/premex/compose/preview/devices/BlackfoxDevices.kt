package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Blackfox device specifications for Android Compose previews.
 *
 * This extension provides Blackfox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Blackfox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Blackfox: Any
  get() = object {
      /** DeviceSpec(manufacturer=Blackfox, code=BMM531A, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Blackfox, code=BMM531A, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val BMM531A = "spec:width=480,height=960,unit=px,dpi=240"

  }
