package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Gradiente device specifications for Android Compose previews.
 *
 * This extension provides Gradiente device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gradiente.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gradiente: Any
  get() = object {
      /** DeviceSpec(manufacturer=Gradiente, code=GTB_106, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Gradiente, code=GTB_106, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GTB_106 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
