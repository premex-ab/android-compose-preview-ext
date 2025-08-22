package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Astro_Tab device specifications for Android Compose previews.
 *
 * This extension provides Astro_Tab device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AstroTab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AstroTab: Any
  get() = object {
      /** DeviceSpec(manufacturer=Astro_Tab, code=DCG-P10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Astro_Tab, code=DCG-P10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val DCG_P10 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
