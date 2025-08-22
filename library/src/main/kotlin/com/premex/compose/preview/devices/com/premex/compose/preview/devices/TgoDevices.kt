package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * t_go device specifications for Android Compose previews.
 *
 * This extension provides t_go device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tgo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tgo: Any
  get() = object {
      /** DeviceSpec(manufacturer=t_go, code=TGO_TB850iH, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=t_go, code=TGO_TB850iH, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TGO_TB850IH = "spec:width=800,height=1280,unit=px,dpi=213"

  }
