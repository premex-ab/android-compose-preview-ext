package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EnergySistem device specifications for Android Compose previews.
 *
 * This extension provides EnergySistem device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EnergySistem.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EnergySistem: Any
  get() = object {
      /** DeviceSpec(manufacturer=EnergySistem, code=adelroth, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EnergySistem, code=adelroth,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val ADELROTH = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
