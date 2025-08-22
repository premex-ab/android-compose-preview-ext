package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * meanit device specifications for Android Compose previews.
 *
 * This extension provides meanit device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Meanit.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Meanit: Any
  get() = object {
      /** DeviceSpec(manufacturer=meanit, code=meanit_K28_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meanit, code=meanit_K28_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val MEANIT_K28_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=meanit, code=meanit_X50_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=meanit, code=meanit_X50_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MEANIT_X50_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
