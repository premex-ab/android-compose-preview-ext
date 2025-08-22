package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KUBIK device specifications for Android Compose previews.
 *
 * This extension provides KUBIK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KUBIK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KUBIK: Any
  get() = object {
      /** DeviceSpec(manufacturer=KUBIK, code=KUBIK_GENTA_10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KUBIK, code=KUBIK_GENTA_10,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val KUBIK_GENTA_10 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
