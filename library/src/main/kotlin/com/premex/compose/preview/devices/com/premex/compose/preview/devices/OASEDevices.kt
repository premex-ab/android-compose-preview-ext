package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OASE device specifications for Android Compose previews.
 *
 * This extension provides OASE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OASE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OASE: Any
  get() = object {
      /** DeviceSpec(manufacturer=OASE, code=EL-P1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OASE, code=EL-P1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val EL_P1 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
