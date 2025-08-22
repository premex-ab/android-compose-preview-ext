package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SORIANA device specifications for Android Compose previews.
 *
 * This extension provides SORIANA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SORIANA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SORIANA: Any
  get() = object {
      /** DeviceSpec(manufacturer=SORIANA, code=BE_ets, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SORIANA, code=BE_ets, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BE_ETS = "spec:width=480,height=854,unit=px,dpi=240"

  }
