package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Bfelix device specifications for Android Compose previews.
 *
 * This extension provides Bfelix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bfelix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bfelix: Any
  get() = object {
      /** DeviceSpec(manufacturer=Bfelix, code=BF1001_Kids, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bfelix, code=BF1001_Kids,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val BF1001_KIDS = "spec:width=800,height=1280,unit=px,dpi=213"

  }
