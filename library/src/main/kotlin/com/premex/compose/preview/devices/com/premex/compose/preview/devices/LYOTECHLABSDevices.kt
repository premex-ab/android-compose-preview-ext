package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LYOTECH_LABS device specifications for Android Compose previews.
 *
 * This extension provides LYOTECH_LABS device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LYOTECHLABS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LYOTECHLABS: Any
  get() = object {
      /** DeviceSpec(manufacturer=LYOTECH_LABS, code=LFi_ONE, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LYOTECH_LABS, code=LFi_ONE,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val LFI_ONE = "spec:width=1080,height=2460,unit=px,dpi=480"

  }
