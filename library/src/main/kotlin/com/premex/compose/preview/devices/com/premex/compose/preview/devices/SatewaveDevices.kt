package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Satewave device specifications for Android Compose previews.
 *
 * This extension provides Satewave device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Satewave.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Satewave: Any
  get() = object {
      /** DeviceSpec(manufacturer=Satewave, code=HPAD-IP8045, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Satewave, code=HPAD-IP8045,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val HPAD_IP8045 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
