package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PL_TMPL device specifications for Android Compose previews.
 *
 * This extension provides PL_TMPL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PLTMPL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PLTMPL: Any
  get() = object {
      /** DeviceSpec(manufacturer=PL_TMPL, code=KSTB6077, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PL_TMPL, code=KSTB6077, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KSTB6077 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
