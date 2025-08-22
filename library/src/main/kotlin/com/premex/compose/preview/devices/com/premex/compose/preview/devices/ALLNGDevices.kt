package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ALL_N_G device specifications for Android Compose previews.
 *
 * This extension provides ALL_N_G device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ALLNG.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ALLNG: Any
  get() = object {
      /** DeviceSpec(manufacturer=ALL_N_G, code=mypad2, width=752, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALL_N_G, code=mypad2, width=752,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MYPAD2 = "spec:width=752,height=1280,unit=px,dpi=160"

  }
