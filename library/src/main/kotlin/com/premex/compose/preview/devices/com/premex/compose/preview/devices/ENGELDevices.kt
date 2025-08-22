package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ENGEL device specifications for Android Compose previews.
 *
 * This extension provides ENGEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ENGEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ENGEL: Any
  get() = object {
      /** DeviceSpec(manufacturer=ENGEL, code=osaki, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ENGEL, code=osaki, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val OSAKI = "spec:width=720,height=1280,unit=px,dpi=213"

  }
