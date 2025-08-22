package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ARMADILOS device specifications for Android Compose previews.
 *
 * This extension provides ARMADILOS device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ARMADILOS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ARMADILOS: Any
  get() = object {
      /** DeviceSpec(manufacturer=ARMADILOS, code=Listo22, width=600, height=1024, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARMADILOS, code=Listo22, width=600,
      height=1024, dpi=220, isGoogleDevice=false).code */
      val LISTO22 = "spec:width=600,height=1024,unit=px,dpi=220"

  }
