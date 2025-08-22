package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Intelkom device specifications for Android Compose previews.
 *
 * This extension provides Intelkom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Intelkom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Intelkom: Any
  get() = object {
      /** DeviceSpec(manufacturer=Intelkom, code=meanIT_C10C11, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Intelkom, code=meanIT_C10C11,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MEANIT_C10C11 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
