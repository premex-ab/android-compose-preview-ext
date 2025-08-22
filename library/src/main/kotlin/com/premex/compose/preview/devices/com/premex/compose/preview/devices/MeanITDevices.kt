package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MeanIT device specifications for Android Compose previews.
 *
 * This extension provides MeanIT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MeanIT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MeanIT: Any
  get() = object {
      /** DeviceSpec(manufacturer=MeanIT, code=meanIT_X4, width=480, height=1014, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MeanIT, code=meanIT_X4, width=480,
      height=1014, dpi=240, isGoogleDevice=false).code */
      val MEANIT_X4 = "spec:width=480,height=1014,unit=px,dpi=240"

  }
