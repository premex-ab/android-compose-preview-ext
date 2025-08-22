package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LAZOR device specifications for Android Compose previews.
 *
 * This extension provides LAZOR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LAZOR.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LAZOR: Any
  get() = object {
      /** DeviceSpec(manufacturer=LAZOR, code=InfinityT10101, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAZOR, code=InfinityT10101,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val INFINITYT10101 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
