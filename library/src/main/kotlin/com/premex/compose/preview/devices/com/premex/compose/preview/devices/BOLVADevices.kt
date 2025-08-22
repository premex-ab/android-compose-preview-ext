package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BOLVA device specifications for Android Compose previews.
 *
 * This extension provides BOLVA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BOLVA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BOLVA: Any
  get() = object {
      /** DeviceSpec(manufacturer=BOLVA, code=B_TAB1021, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BOLVA, code=B_TAB1021, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val B_TAB1021 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
