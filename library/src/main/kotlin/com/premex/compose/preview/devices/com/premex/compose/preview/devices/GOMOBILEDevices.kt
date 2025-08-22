package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GOMOBILE device specifications for Android Compose previews.
 *
 * This extension provides GOMOBILE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GOMOBILE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GOMOBILE: Any
  get() = object {
      /** DeviceSpec(manufacturer=GOMOBILE, code=G860, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOMOBILE, code=G860, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val G860 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=GOMOBILE, code=GM, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOMOBILE, code=GM, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val GM = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=GOMOBILE, code=GO1452, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GOMOBILE, code=GO1452, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val GO1452 = "spec:width=480,height=854,unit=px,dpi=240"

  }
