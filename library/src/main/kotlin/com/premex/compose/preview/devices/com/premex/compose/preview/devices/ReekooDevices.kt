package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Reekoo device specifications for Android Compose previews.
 *
 * This extension provides Reekoo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Reekoo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Reekoo: Any
  get() = object {
      /** DeviceSpec(manufacturer=Reekoo, code=AllCall_60, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Reekoo, code=AllCall_60, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val ALLCALL_60 = "spec:width=720,height=1612,unit=px,dpi=320"

  }
